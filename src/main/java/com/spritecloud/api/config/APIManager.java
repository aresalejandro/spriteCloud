package com.spritecloud.api.config;

import com.spritecloud.api.model.Response;
import com.spritecloud.api.utils.JsonUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class APIManager {

    public static final String BASE_URL = PropertyManager.getProperty("base.api");
    private static final ThreadLocal<Response> LAST_RESPONSE = new ThreadLocal<Response>();

    public static void setLastResponse(Response lastResponse) {
        LAST_RESPONSE.set(lastResponse);
    }

    public static Response getLastResponse() {
        return LAST_RESPONSE.get();
    }

    public static <T> T getResponseFromJsonFile(String jsonFileName, Class<T> valueType) throws IOException {
        return JsonUtils.getJSONFromFileAsObject("response".concat(File.separator).concat(jsonFileName), valueType);
    }

    public static <T> List<T> getListResponseFromJsonFile(String jsonFileName, Class<T> valueType) throws IOException {
        return JsonUtils.getListJSONFromFileAsObject("response".concat(File.separator).concat(jsonFileName), valueType);
    }
        
}