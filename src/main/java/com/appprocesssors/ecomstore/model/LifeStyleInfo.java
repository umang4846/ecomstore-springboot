package com.appprocesssors.ecomstore.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LifeStyleInfo {


    @SerializedName("sleeve")
    @Expose
    private String sleeve;
    @SerializedName("neck")
    @Expose
    private String neck;
    @SerializedName("idealFor")
    @Expose
    private String idealFor;
    @SerializedName("specificationList")
    @Expose
    private List<SpecificationList> specificationList = null;

    public String getSleeve() {
        return sleeve;
    }

    public void setSleeve(String sleeve) {
        this.sleeve = sleeve;
    }

    public String getNeck() {
        return neck;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }

    public String getIdealFor() {
        return idealFor;
    }

    public void setIdealFor(String idealFor) {
        this.idealFor = idealFor;
    }

    public List<SpecificationList> getSpecificationList() {
        return specificationList;
    }

    public void setSpecificationList(List<SpecificationList> specificationList) {
        this.specificationList = specificationList;
    }
}