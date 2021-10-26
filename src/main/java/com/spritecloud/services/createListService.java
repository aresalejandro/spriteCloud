package com.spritecloud.services;

import com.spritecloud.api.config.APIManager;
import com.spritecloud.api.model.CreateWithListModel;
import com.spritecloud.api.model.InventoryModel;
import com.spritecloud.api.model.Request;
import com.spritecloud.api.model.Response;
import com.spritecloud.api.utils.JsonUtils;
import org.testng.Assert;


import java.io.IOException;
import java.util.Random;

public class createListService extends MethodsService {

    public static Response post(String jsonName) throws IOException {
        Random rand = new Random();
        Integer randomNum = rand.nextInt((10 - 1) + 1) + 1;

        String json = JsonUtils.getJSONFromFile(jsonName);
        json = json.replace("{{id}}", randomNum.toString());
    	Request newRequest = JsonUtils.deserialize(json,Request.class);
    	
       return post(newRequest, CreateWithListModel.class);
    }

    public void validateFields(Object actualResponse) {
        CreateWithListModel createWithList = (CreateWithListModel) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(createWithList.getMessage().toString(),"ok");
    }

}
