package com.spritecloud.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonInclude;

public class InventoryModel {

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("sold")
    private Integer sold;




}