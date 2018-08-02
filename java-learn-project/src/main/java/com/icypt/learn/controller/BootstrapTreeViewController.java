package com.icypt.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BootstrapTreeViewController {

    @GetMapping("/bootstrapTreeView/getIndex")
    public String goIndex() {
        return "bootstrapTreeView/index";
    }

}
