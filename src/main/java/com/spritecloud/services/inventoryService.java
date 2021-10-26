package com.spritecloud.services;

import com.spritecloud.api.config.APIManager;
import com.spritecloud.api.model.InventoryModel;
import com.spritecloud.api.model.Request;
import com.spritecloud.api.model.Response;
import com.spritecloud.api.utils.JsonUtils;
import org.testng.Assert;

import java.io.IOException;

public class inventoryService extends MethodsService {

    public static Response get(String jsonName) throws IOException {
        String json = JsonUtils.getJSONFromFile(jsonName);
    	Request newRequest = JsonUtils.deserialize(json,Request.class);
    	
       return get(newRequest, InventoryModel.class);
    }

    public void validateFields(Object actualResponse) {
        InventoryModel inventory = (InventoryModel) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(inventory.getOk().toString(),"1");
    }

}
