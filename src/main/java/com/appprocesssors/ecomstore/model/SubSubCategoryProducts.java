package com.appprocesssors.ecomstore.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "subSubCategoryProducts")
public class SubSubCategoryProducts {

    public  String _id;
    public  String name;
    public  String link;
    public  String menuid;

    public SubSubCategoryProducts(String _id, String name, String link, String menuid) {
        this._id = _id;
        this.name = name;
        this.link = link;
        this.menuid = menuid;
    }

    public SubSubCategoryProducts() {
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

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }
}
