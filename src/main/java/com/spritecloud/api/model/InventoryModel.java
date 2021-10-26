package com.spritecloud.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonInclude;

public class InventoryModel {

    public Integer getOk() {
        return ok;
    }

    public void setOk(Integer listPet) {
        this.ok = listPet;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("OK")
    private Integer ok;




}