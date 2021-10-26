package com.spritecloud.services;

import com.spritecloud.api.config.APIManager;
import com.spritecloud.api.config.MyThreadLocal;
import com.spritecloud.api.model.CreateWithListModel;
import com.spritecloud.api.model.PutUserNameModel;
import com.spritecloud.api.model.Request;
import com.spritecloud.api.model.Response;
import com.spritecloud.api.utils.JsonUtils;
import org.testng.Assert;

import java.io.IOException;
import java.util.Random;

public class putUserNameService extends MethodsService {

    public static Response put(String jsonName) throws IOException {
        Random rand = new Random();
        Integer randomNum = rand.nextInt((10 - 1) + 1) + 1;

        MyThreadLocal.setData("id",randomNum);

        String json = JsonUtils.getJSONFromFile(jsonName);
        json = json.replace("{{username}}", "user1");
        json = json.replace("{{id}}", randomNum.toString());
    	Request newRequest = JsonUtils.deserialize(json,Request.class);
    	
       return put(newRequest, PutUserNameModel.class);
    }

    public void validateFields(Object actualResponse) {
        PutUserNameModel putUserNameModel = (PutUserNameModel) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(putUserNameModel.getMessage().toString(),MyThreadLocal.getData("id").toString());
    }
}
