package com.appprocesssors.ecomstore.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "categoryHome")

public class CategoryHome {

    private String _id;
    private String name;
    private String link;

    public CategoryHome() {
    }

    public CategoryHome(String _id, String name, String link) {
        this._id = _id;
        this.name = name;
        this.link = link;
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
