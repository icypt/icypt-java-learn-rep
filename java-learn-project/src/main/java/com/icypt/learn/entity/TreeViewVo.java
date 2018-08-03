package com.icypt.learn.entity;

import java.io.Serializable;
import java.util.List;

public class TreeViewVo implements Serializable{

    /**
     * 节点文本信息
     */
    private String text;
    /**
     * 节点图标
     */
    private String icon;
    /**
     * 节点选中时图标
     */
    private String selectedIcon;
    /**
     * 节点前景色
     */
    private String color;
    /**
     * 节点背景色
     */
    private String backColor;
    /**
     * 节点链接
     */
    private String href;
    /**
     * 节点是否可被选择
     */
    private Boolean selectable;
    /**
     * 节点状态
     */
    private TreeState state;
    /**
     * 结合全局showTags选项来在列表树节点的右边添加额外的信息
     */
    private Object tags;
    /**
     * 子节点列表
     */
    private List<TreeViewVo> nodes;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSelectedIcon() {
        return selectedIcon;
    }

    public void setSelectedIcon(String selectedIcon) {
        this.selectedIcon = selectedIcon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBackColor() {
        return backColor;
    }

    public void setBackColor(String backColor) {
        this.backColor = backColor;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    public TreeState getState() {
        return state;
    }

    public void setState(TreeState state) {
        this.state = state;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public List<TreeViewVo> getNodes() {
        return nodes;
    }

    public void setNodes(List<TreeViewVo> nodes) {
        this.nodes = nodes;
    }

    public TreeState getTreeStateInstance() {
        return new TreeState();
    }

    /**
     * 定义节点状态
     */
    public class TreeState{
        /**
         *指示一个节点是否处于checked状态，用一个checkbox图标表示
         */
        private Boolean checked = false;
        /**
         *指示一个节点是否处于disabled状态
         */
        private Boolean disabled = false;
        /**
         *指示一个节点是否处于展开状态
         */
        private Boolean expanded = false;
        /**
         *指示一个节点是否可以被选择
         */
        private Boolean selected = false;

        public Boolean getChecked() {
            return checked;
        }

        public void setChecked(Boolean checked) {
            this.checked = checked;
        }

        public Boolean getDisabled() {
            return disabled;
        }

        public void setDisabled(Boolean disabled) {
            this.disabled = disabled;
        }

        public Boolean getExpanded() {
            return expanded;
        }

        public void setExpanded(Boolean expanded) {
            this.expanded = expanded;
        }

        public Boolean getSelected() {
            return selected;
        }

        public void setSelected(Boolean selected) {
            this.selected = selected;
        }
    }
}
