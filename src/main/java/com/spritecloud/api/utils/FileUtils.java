package com.spritecloud.api.utils;

import org.testng.log4testng.Logger;
import java.io.*;
import java.util.*;

public class FileUtils {

      public static <T> void writeListOutputs(List<T> actualList, List<T> expectedList) {
        try {
            String className = getClassName(actualList);
            String random = DateUtils.getActualDateFormatted("ddmmyyHHmm-ss-SSS");

            writeOutput(actualList, random, "actual".concat(className));

            writeOutput(expectedList, random, "expected".concat(className));
        } catch (Exception e) {
            Logger.getLogger(FileUtils.class).error(">>> Error trying to write the output: ", e);
        }
    }

    private static <T> void writeOutput(List<T> list, String random, String fileInitialName) throws IOException {
        FileWriter writer = getFileWriter(random, fileInitialName.concat("_"));
        List<String> headers = new ArrayList<>();
        Boolean headersAdded = false;
        for (Object object : list) {
            List<String> outputs = new ArrayList<>();
            Map<String, Object> sorted = MapsUtils.sortMap(object);

            addData(headers, headersAdded, outputs, sorted);
            headersAdded = writeDataInFile(writer, headers, headersAdded, outputs);
        }
        writer.close();
    }

    private static Boolean writeDataInFile(FileWriter writer, List<String> headers, Boolean headersAdded, List<String> outputs) throws IOException {
        if (!headersAdded) {
            String headerActual = String.join(",", headers);
            writer.write(headerActual.concat(System.lineSeparator()));
        }
        String output = String.join(",", outputs);
        writer.write(output.concat(System.lineSeparator()));
        return true;
    }

    private static void addData(List<String> headers, Boolean headersAdded, List<String> outputs, Map<String, Object> sorted) {
        Iterator<Map.Entry> iterator = MapsUtils.getIterator(sorted);
        while (iterator.hasNext()) {
            Map.Entry<String, Object> entry = iterator.next();

            String key = entry.getKey();
            Object value = entry.getValue();
            outputs.add(String.valueOf(value));
            if (!headersAdded) {
                headers.add(key.toUpperCase());
            }
        }
    }

    private static <T> String getClassName(List<T> list) {
        return list.iterator().next().getClass().getSimpleName();
    }

    private static FileWriter getFileWriter(String random, String fileName) throws IOException {
        File file = new File(System.getProperty("user.dir").concat(File.separator).concat("target").concat(File.separator).concat("output"));
        file.mkdir();
        return new FileWriter(file.getAbsolutePath().concat(File.separator).concat(fileName + random + ".txt"));
    }
}