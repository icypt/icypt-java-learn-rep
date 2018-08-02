package com.icypt.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.icypt.learn.entity.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MenuTreeController {
    @RequestMapping("/getMenuTreeData")
    @ResponseBody
    public Object getTreeViewData() {
        //构造数据记录
        List<Menu> originalData = new ArrayList<Menu>();
        Menu menu01 = new Menu("1", "第一层", "", "");
        originalData.add(menu01);

        Menu menu02 = new Menu("2", "第二层", "1", "");
        originalData.add(menu02);

        Menu menu03 = new Menu("3", "第二层", "1", "");
        originalData.add(menu03);

        Menu menu04 = new Menu("4", "第二层", "1", "");
        originalData.add(menu04);

        Menu menu05 = new Menu("5", "第三层", "4", "www");
        originalData.add(menu05);

        Menu menu06 = new Menu("6", "第三层", "4", "www");
        originalData.add(menu06);

        Menu menu07 = new Menu("7", "第一层", "", "");
        originalData.add(menu07);

        Menu menu08 = new Menu("8", "第二层", "7", "");
        originalData.add(menu08);

        Menu menu09 = new Menu("9", "第一层", "", "");
        originalData.add(menu09);

        Menu menu10 = new Menu("10", "第一层", "9", "");
        originalData.add(menu10);

        List<MenuTreeVo> result = getTreeData(originalData);
        return result;
    }


    /**
     * 取得父级节点
     * @param originalData
     * @return
     */
    public static List<MenuTreeVo> getTreeData(List<Menu> originalData) {
        List<Menu> parentMenus = new ArrayList<Menu>();
        if(originalData != null && originalData.size() > 0) {
            for(Menu menu : originalData) {
                if(menu.getParentId() == null || "".equals(menu.getParentId())) {
                    parentMenus.add(menu);
                }
            }
        } else {
            System.out.println("原数据为空");
        }

        List<MenuTreeVo> result = new ArrayList<MenuTreeVo>();
        MenuTreeVo menuTreeVo = null;
        for(Menu menu : parentMenus) {
            menuTreeVo = new MenuTreeVo();
            menuTreeVo.setId(menu.getId());
            menuTreeVo.setTitle(menu.getTitle());
            menuTreeVo.setUrl(menu.getUrl());
            if(menu.getUrl() != null && "".equals(menu.getUrl())) {
                List<MenuTreeVo> childMenuTreeNode = getMenuTree(menu.getId(), originalData);
                menuTreeVo.setEntityTrees(childMenuTreeNode);
            }
            result.add(menuTreeVo);
        }

        return result;
    }

    public static List<MenuTreeVo> getMenuTree(String id, List<Menu> originalData) {
        List<MenuTreeVo> childMenuNode = new ArrayList<MenuTreeVo>();
        MenuTreeVo MenuTreeVo = null;
        for(Menu Menu : originalData) {
            //递归出口
            if(Menu.getParentId().equals(id)) {
                MenuTreeVo = new MenuTreeVo();
                MenuTreeVo.setId(Menu.getId());
                MenuTreeVo.setTitle(Menu.getTitle());
                MenuTreeVo.setUrl(Menu.getUrl());
                if(Menu.getUrl() != null && "".equals(Menu.getUrl())) {
                    List<MenuTreeVo> MenuTrees = getMenuTree(Menu.getId(), originalData);
                    MenuTreeVo.setEntityTrees(MenuTrees);
                }
                childMenuNode.add(MenuTreeVo);
            }
        }
        if(childMenuNode == null ||childMenuNode.size() < 0) {
            return null;
        } else {
            return childMenuNode;
        }

    }

}
