package com.spritecloud.services;

import com.spritecloud.api.config.APIManager;
import com.spritecloud.api.model.CreateWithListModel;
import com.spritecloud.api.model.Request;
import com.spritecloud.api.model.Response;
import com.spritecloud.api.model.UpdateImagePetModel;
import com.spritecloud.api.utils.JsonUtils;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class updateImagePetService extends MethodsService {

    public static void updateImage() throws IOException, ParseException {
        Random rand = new Random();
        Integer randomNum = rand.nextInt((10 - 1) + 1) + 1;

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost uploadFile = new HttpPost("https://petstore.swagger.io/v2/pet/"+ randomNum.toString() +"/uploadImage");

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();

        // TODO: armar un request en un archivo json y obtenerlo desde ahi.
        String sTestsetFile= System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"image"+File.separator+Paths.get("dog")+".jpg";
        File f = new File(sTestsetFile);
        builder.addBinaryBody(
                "file",
                new FileInputStream(f),
                ContentType.APPLICATION_OCTET_STREAM,
                f.getName()
        );

        HttpEntity multipart = builder.build();
        uploadFile.setEntity(multipart);

        CloseableHttpResponse response = httpClient.execute(uploadFile);
        HttpEntity responseEntity = response.getEntity();
        String sResponse= EntityUtils.toString(responseEntity, "UTF-8");
        System.out.println("Post return result"+sResponse);

    }

    public void validateFields(Object actualResponse) {
        CreateWithListModel createWithList = (CreateWithListModel) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(createWithList.getMessage().toString(),"ok");
    }

}
