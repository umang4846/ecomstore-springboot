package com.appprocesssors.ecomstore.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductHighlight {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("phFive")
    @Expose
    private String phFive;
    @SerializedName("phFour")
    @Expose
    private String phFour;
    @SerializedName("phOne")
    @Expose
    private String phOne;
    @SerializedName("phThree")
    @Expose
    private String phThree;
    @SerializedName("phTwo")
    @Expose
    private String phTwo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhFive() {
        return phFive;
    }

    public void setPhFive(String phFive) {
        this.phFive = phFive;
    }

    public String getPhFour() {
        return phFour;
    }

    public void setPhFour(String phFour) {
        this.phFour = phFour;
    }

    public String getPhOne() {
        return phOne;
    }

    public void setPhOne(String phOne) {
        this.phOne = phOne;
    }

    public String getPhThree() {
        return phThree;
    }

    public void setPhThree(String phThree) {
        this.phThree = phThree;
    }

    public String getPhTwo() {
        return phTwo;
    }

    public void setPhTwo(String phTwo) {
        this.phTwo = phTwo;
    }

}
