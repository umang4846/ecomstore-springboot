package com.appprocesssors.ecomstore.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bannerHome")
public class BannerHome {

    private String _id;
    private String name;
    private String link;
    private String productCode;

    public BannerHome() {
    }

    public BannerHome(String _id, String name, String link, String productCode) {
        this._id = _id;
        this.name = name;
        this.link = link;
        this.productCode = productCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
