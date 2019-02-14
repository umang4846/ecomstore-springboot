package com.appprocesssors.ecomstore.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class Address {


    @SerializedName("_id")
    @Expose
    private String _id;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("subDistrict")
    @Expose
    private String subDistrict;
    @SerializedName("cityTown")
    @Expose
    private String cityTown;
    @SerializedName("homeNoBuildingName")
    @Expose
    private String homeNoBuildingName;
    @SerializedName("localityAreaStreet")
    @Expose
    private String localityAreaStreet;
    @SerializedName("mobileNo")
    @Expose
    private String mobileNo;
    @SerializedName("alternateMobileNumber")
    @Expose
    private String alternateMobileNumber;
    @SerializedName("addressType")
    @Expose
    private String addressType;
    @SerializedName("isDefaultAddress")
    @Expose
    private Boolean isDefaultAddress;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Boolean getDefaultAddress() {
        return isDefaultAddress;
    }

    public void setDefaultAddress(Boolean defaultAddress) {
        isDefaultAddress = defaultAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSubDistrict() {
        return subDistrict;
    }

    public void setSubDistrict(String subDistrict) {
        this.subDistrict = subDistrict;
    }

    public String getCityTown() {
        return cityTown;
    }

    public void setCityTown(String cityTown) {
        this.cityTown = cityTown;
    }

    public String getHomeNoBuildingName() {
        return homeNoBuildingName;
    }

    public void setHomeNoBuildingName(String homeNoBuildingName) {
        this.homeNoBuildingName = homeNoBuildingName;
    }

    public String getLocalityAreaStreet() {
        return localityAreaStreet;
    }

    public void setLocalityAreaStreet(String localityAreaStreet) {
        this.localityAreaStreet = localityAreaStreet;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAlternateMobileNumber() {
        return alternateMobileNumber;
    }

    public void setAlternateMobileNumber(String alternateMobileNumber) {
        this.alternateMobileNumber = alternateMobileNumber;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }


    public Boolean getIsDefaultAddress() {
        return isDefaultAddress;
    }

    public void setIsDefaultAddress(Boolean isDefaultAddress) {
        this.isDefaultAddress = isDefaultAddress;
    }

}
