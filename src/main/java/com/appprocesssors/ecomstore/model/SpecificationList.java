package com.appprocesssors.ecomstore.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SpecificationList {

    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("values")
    @Expose
    private List<Value> values = null;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

}
