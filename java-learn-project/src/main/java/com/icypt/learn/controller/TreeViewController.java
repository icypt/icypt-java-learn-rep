package com.icypt.learn.controller;

import com.icypt.learn.entity.TreeViewVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TreeViewController {

    @GetMapping("/treeView/getIndex")
    public String goIndex() {
        return "treeView/index";
    }

    @GetMapping("/treeView/getTreeViewData")
    @ResponseBody
    public Object getTreeViewData() {
        List<TreeViewVo> treeViewVos = new ArrayList<>();
        TreeViewVo treeViewVo  = null;
        TreeViewVo.TreeState treeState = null;
        for(int i=0; i < 3; i++) {
            treeViewVo = new TreeViewVo();
            treeState = new TreeViewVo().new TreeState();
            treeViewVo.setText("text"+i);
            treeViewVo.setIcon("glyphicon glyphicon-leaf");
            treeViewVo.setSelectedIcon("glyphicon glyphicon-leaf");
            treeViewVo.setHref("#node-"+i);
            treeViewVo.setSelectable(true);
            treeViewVo.setState(treeState);
            treeViewVo.setNodes(getTreeData());
            treeViewVos.add(treeViewVo);
        }
        return treeViewVos;
    }

    public List<TreeViewVo> getTreeData() {
        List<TreeViewVo> treeViewVos = new ArrayList<>();
        TreeViewVo treeViewVo  = null;
        TreeViewVo.TreeState treeState = null;
        for(int i=0; i < 3; i++) {
            treeViewVo = new TreeViewVo();
            treeState = new TreeViewVo().new TreeState();
            treeViewVo.setText("text"+i);
            treeViewVo.setIcon("glyphicon glyphicon-leaf");
            treeViewVo.setSelectedIcon("glyphicon glyphicon-leaf");
            treeViewVo.setHref("#node-"+i);
            treeViewVo.setSelectable(true);
            treeViewVo.setState(treeState);
            treeViewVos.add(treeViewVo);
        }
        return treeViewVos;
    }
}
