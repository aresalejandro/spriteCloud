package com.spritecloud.api.utils;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.JsonNode;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.type.TypeFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.log4testng.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JsonUtils {

    private static ObjectMapper mapper = new ObjectMapper();

    private static ObjectMapper getMapper() {
        if (mapper == null) {
            mapper = new ObjectMapper();
        }
        return mapper;
    }

    public static <T> T deserialize(String json, Class<T> type) {
        try {
            TypeFactory typeFactory = getMapper().getTypeFactory();
            return (T) mapper.readValue(json, typeFactory.constructType(type));
        } catch (IOException e) {
            Logger.getLogger(JsonUtils.class).error(e.getMessage());
        }
        return null;
    }

    public static String serialize(Object json) {
        String jsonResult = null;
        try {
            jsonResult = getMapper().writeValueAsString(json);
        } catch (IOException e) {
            Logger.getLogger(JsonUtils.class).error(e.getMessage());
        }
        return jsonResult;
    }

    public static boolean isJSONValid(Object jsonObject) {
        String jsonString = serialize(jsonObject);
        return isJSONValid(jsonString);
    }

    public static boolean isJSONValid(String json) {
        try {
            new JSONObject(json);
        } catch (JSONException ex) {
            try {
                new JSONArray(json);
            } catch (JSONException ex1) {
                return false;
            }
        } catch (NullPointerException e){
            return false;
        }
        return true;
    }

    public static String getJSONFromFile(String fileName) throws IOException {
        String path = System.getProperty("user.dir").concat(File.separator).concat("src").concat(File.separator).concat("test").concat(File.separator).concat("resources").concat(File.separator).concat("jsons").concat(File.separator).concat(fileName).concat(".json");
        return getJSONFromPath(path);
    }

    public static String getJSONFromPath(String path) throws IOException {
        return getJSON(Paths.get(path));
    }

    public static <T> T getJSONFromFileAsObject(String file, Class<T> valueType) throws IOException {
        String json = getJSONFromFile(file);
        return getMapper().readValue(json, valueType);
    }

    public static <T> List<T> getListJSONFromFileAsObject(String file, Class<T> valueType) throws IOException {
        TypeFactory typeFactory = getMapper().getTypeFactory();
        String json = getJSONFromFile(file);
        return getMapper().readValue(json, typeFactory.constructCollectionType(List.class, valueType));
    }


    public static String getJSON(Path file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        FileInputStream fis = new FileInputStream(file.toFile());
        JsonNode rootNode = mapper.readTree(fis);
        return rootNode.toString();
    }

}