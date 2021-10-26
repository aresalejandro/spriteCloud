package com.spritecloud.api.model;



import com.spritecloud.api.utils.JsonUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

import static com.spritecloud.api.config.APIManager.BASE_URL;

public class Request {

    private Object body;
    private String url;
    private String endpoint;
    private Map<String, String> headers;
    private Map<String, String> urlParameters;

    public String getCompleteUrl() {
        String completeUrl = url;
        if (StringUtils.isEmpty(url)) {
            completeUrl = BASE_URL;
        }
        if (!StringUtils.isEmpty(endpoint)) {
            completeUrl = completeUrl.concat(endpoint);
        }
        return completeUrl;
    }

    public String getUrl() {
        return url;
    }

        public String getUrl(String var) {
        return url.replace("{}", var);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getBody() {
        if (body == null) {
            return "";
        } else if (JsonUtils.isJSONValid(body)) {
            return JsonUtils.serialize(body);
        } else {
            return body;
        }
    }

    public Map<String, String> getHeaders() {
        if(MapUtils.isEmpty(headers)){
            headers = new HashMap<>();
        }
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public void addHeader(String key, String value){
        getHeaders().put(key, value);
    }

    public Map<String, String> getUrlParameters() {
        if (MapUtils.isEmpty(urlParameters)) {
            urlParameters =  new HashMap<>();
        }
        return urlParameters;
    }

    public void addUrlParameter(String key, String value){
        getUrlParameters().put(key, value);
    }

    public void setUrlParameters(Map<String, String> urlParameters) {
        this.urlParameters = urlParameters;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(getCompleteUrl());
        if(!getUrlParameters().isEmpty()){
            builder.append(", ");
            builder.append(getUrlParameters());
        }
        if(!getHeaders().isEmpty()){
            builder.append(", ");
            builder.append(getHeaders());
        }
        if(!getBody().toString().isEmpty()){
            builder.append(", ");
            builder.append(getBody());
        }
        return builder.toString();
    }
}