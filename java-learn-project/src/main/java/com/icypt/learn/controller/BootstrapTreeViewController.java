package com.icypt.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;

@Controller
public class BootstrapTreeViewController {
    @RequestMapping("/getTreeViewData")
    @ResponseBody
    public Object getTreeViewData() {
//        Me
//        //构造数据记录
//        List<Menu>  originalData = new ArrayList<Menu>();
//        Entity entity01 = new Entity("1", "第一层", "", "");
//        originalData.add(entity01);
//
//        Entity entity02 = new Entity("2", "第二层", "1", "");
//        originalData.add(entity02);
//
//        Entity entity03 = new Entity("3", "第二层", "1", "");
//        originalData.add(entity03);
//
//        Entity entity04 = new Entity("4", "第二层", "1", "");
//        originalData.add(entity04);
//
//        Entity entity05 = new Entity("5", "第三层", "4", "www");
//        originalData.add(entity05);
//
//        Entity entity06 = new Entity("6", "第三层", "4", "www");
//        originalData.add(entity06);
//
//        Entity entity07 = new Entity("7", "第一层", "", "");
//        originalData.add(entity07);
//
//        Entity entity08 = new Entity("8", "第二层", "7", "");
//        originalData.add(entity08);
//
//        Entity entity09 = new Entity("9", "第一层", "", "");
//        originalData.add(entity09);
//
//        Entity entity10 = new Entity("10", "第一层", "9", "");
//        originalData.add(entity10);
//
//        List<EntityTree> result = getTreeData(originalData);
//        System.out.println(gson.toJson(result));
//    }
//
        return null;
    }


    /**
     * 取得父级节点
     * @param originalData
     * @return
     */
//    public static List<EntityTree> getTreeData(List<Menu> originalData) {
//        List<Entity> parentEntitys = new ArrayList<Entity>();
//        if(originalData != null && originalData.size() > 0) {
//            for(Entity entity : originalData) {
//                if(entity.getParentId() == null || "".equals(entity.getParentId())) {
//                    parentEntitys.add(entity);
//                }
//            }
//        } else {
//            System.out.println("原数据为空");
//        }
//
//        List<EntityTree> result = new ArrayList<EntityTree>();
//        EntityTree entityTree = null;
//        for(Entity entity : parentEntitys) {
//            entityTree = new EntityTree();
//            entityTree.setId(entity.getId());
//            entityTree.setTitle(entity.getTitle());
//            entityTree.setUrl(entity.getUrl());
//            if(entity.getUrl() != null && "".equals(entity.getUrl())) {
//                List<EntityTree> childEntityTreeNode = getEntityTree(entity.getId(), originalData);
//                entityTree.setEntityTrees(childEntityTreeNode);
//            }
//            result.add(entityTree);
//        }
//
//        return result;
//    }
//
//    public static List<EntityTree> getEntityTree(String id, List<Entity> originalData) {
//        List<EntityTree> childEntityNode = new ArrayList<EntityTree>();
//        EntityTree entityTree = null;
//        for(Entity entity : originalData) {
//            //递归出口
//            if(entity.getParentId().equals(id)) {
//                entityTree = new EntityTree();
//                entityTree.setId(entity.getId());
//                entityTree.setTitle(entity.getTitle());
//                entityTree.setUrl(entity.getUrl());
//                if(entity.getUrl() != null && "".equals(entity.getUrl())) {
//                    List<EntityTree> entityTrees = getEntityTree(entity.getId(), originalData);
//                    entityTree.setEntityTrees(entityTrees);
//                }
//                childEntityNode.add(entityTree);
//            }
//        }
//        if(childEntityNode == null ||childEntityNode.size() < 0) {
//            return null;
//        } else {
//            return childEntityNode;
//        }
//
//    }

}
