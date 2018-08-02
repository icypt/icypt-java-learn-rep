package com.icypt.learn.entity;

import java.util.List;

public class MenuTreeVo {
        private String id;
        private String title;
        private String url;
        private List<MenuTreeVo> entityTrees;

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

        public void setUrl(String url) { this.url = url;
        }

    public List<MenuTreeVo> getEntityTrees() {
        return entityTrees;
    }

    public void setEntityTrees(List<MenuTreeVo> entityTrees) {
        this.entityTrees = entityTrees;
    }
}
