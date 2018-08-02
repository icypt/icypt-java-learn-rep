package com.icypt.learn.entity;

import java.io.Serializable;

public class Menu implements Serializable {

    private String id;
    private String title;
    private String url;
    private String parentId;

    public Menu(String id, String title, String parentId, String url) {
        this.id = id;
        this.title = title;
        this.parentId = parentId;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
