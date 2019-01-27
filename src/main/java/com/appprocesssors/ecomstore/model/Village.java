package com.appprocesssors.ecomstore.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Village {

    @SerializedName("_id")
    @Expose
    public String id;
    @SerializedName("villageName")
    @Expose
    public String villageName;
    @SerializedName("isDliveryAvailable")
    @Expose
    public Boolean isDliveryAvailable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public Boolean getIsDliveryAvailable() {
        return isDliveryAvailable;
    }

    public void setIsDliveryAvailable(Boolean isDliveryAvailable) {
        this.isDliveryAvailable = isDliveryAvailable;
    }


}
