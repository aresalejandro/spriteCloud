package com.spritecloud.steps;

import com.spritecloud.api.config.APIManager;
import com.spritecloud.api.config.EntityConfiguration;
import com.spritecloud.api.config.MyThreadLocal;
import com.spritecloud.api.config.PropertyManager;
import com.spritecloud.api.utils.ValidateUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang.StringUtils;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class CommonSteps {
    private Class objectClass;
    private Object actualJsonResponse;
    private Object expectedJsonResponse;

    @Then("expected response is obtained in '([^']*)'")
    public void iWillGetTheProperResponseWithObject(String entity) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        setInjectorParameters(null);
        invokeValidateMethod(entity, "validateFields");
    }

    @When("^I will get the proper status code '(.*)'$")
    public void iWillGetTheProperStatusCodeStatusCode(String expStatusCode) {
        int actualStatusCode = APIManager.getLastResponse().getStatusCode();
        Assert.assertEquals(Integer.parseInt(expStatusCode), actualStatusCode, "The status code are not equals");
    }

    @Given("Execute the method '(.*)' in '(.*)' with '(.*)'")
    public void executeGenericMethod(String method, String entity, String jsonName) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(method.toLowerCase(), String.class).invoke("", "request/".concat(jsonName));
    }

    @Given("Execute the method POST and Update File")
    public void executeFileUpdateMethod() throws IllegalArgumentException, SecurityException, IOException, ParseException {
        Random rand = new Random();
        Integer randomNum = rand.nextInt((10 - 1) + 1) + 1;

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost uploadFile = new HttpPost("https://petstore.swagger.io/v2/pet/"+ randomNum.toString() +"/uploadImage");

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();

        String sTestsetFile= System.getProperty("user.dir")+ File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"image"+File.separator+ Paths.get("dog")+".jpg";
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
        MyThreadLocal.setData("updateFileMenssage",sResponse);
    }

    @When("^I expected response with status code '(.*)' and validate message$")
    public void expectedStatusCodeAndValidateMenssage(String statusCode) {
        String response = MyThreadLocal.getData("updateFileMenssage").toString();
        JSONObject json = new JSONObject(response);
        Assert.assertEquals(json.get("code").toString(), statusCode, "The status code are not equals");

        String update = null;
        if(json.get("message").toString().contains("dog.jpg")){
            update = "true" ;
        }else { update = "false" ; }

        Assert.assertEquals("true", update);
    }

    private Object getActualResponse() {
        return APIManager.getLastResponse().getResponse();
    }

    private Class<?> getResponseClass(List actualJsonResponse) {
        return actualJsonResponse.iterator().next().getClass();
    }

    private List getListResponseFromFile(String jsonName, Class responseClass) throws IOException {
        return APIManager.getListResponseFromJsonFile(jsonName, responseClass);
    }

    private Object getResponseFromFile(String jsonName) throws IOException {
        return APIManager.getResponseFromJsonFile(jsonName, Object.class);
    }

    private void setInjectorParameters(String expectedJsonName) throws IOException {
        if (getActualResponse().getClass().isArray()) {
            actualJsonResponse = ValidateUtils.parseArrayToList((Object[]) getActualResponse());
            objectClass = List.class;
            if (!StringUtils.isEmpty(expectedJsonName)) {
                Class responseClass = getResponseClass((List) actualJsonResponse);
                expectedJsonResponse = getListResponseFromFile(expectedJsonName, responseClass);
            }
        } else {
            actualJsonResponse = getActualResponse();
            objectClass = Object.class;
            if (!StringUtils.isEmpty(expectedJsonName)) {
                expectedJsonResponse = getResponseFromFile(expectedJsonName);
            }
        }
    }

    private Class getServiceClass(String entity) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Class entityCLass = Class.forName(PropertyManager.getProperty("api.entityConfiguration"));
        Enum entityConfiguration = Enum.valueOf(entityCLass, entity);
        Method method = entityConfiguration.getClass().getMethod("getEntityService");
        method.setAccessible(true);
        return (Class) method.invoke(entityConfiguration);
    }

    private void invokeValidateMethod(String entity, String method) throws ClassNotFoundException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        try {
            Class service = this.getServiceClass(entity);
            service.getMethod(method, this.objectClass).invoke(service.newInstance(), this.actualJsonResponse);
        } catch (InvocationTargetException e) {
            Assert.fail(e.getCause().toString());
        }
    }
}
