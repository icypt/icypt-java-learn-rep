package com.icypt.learn.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.net.URLDecoder;
import java.util.Base64;
import java.util.UUID;

@Controller
public class ImgCropperController {
    private static Logger logger = LoggerFactory.getLogger(ImgCropperController.class);

    @RequestMapping("/goImgCropperPage")
    public String goImgCropperPage() {
        return "imgCropper/index";
    }

    @RequestMapping("/uploadImg")
    @ResponseBody
    public String uploadImg(@RequestParam("fileImg") MultipartFile uploadFile, HttpServletRequest request) {
        logger.info("原始文件名称{}", uploadFile.getOriginalFilename());
        logger.info("文件组件名称{}", uploadFile.getName());
        logger.info("文件类型{}", uploadFile.getContentType());
        logger.info("文件大小{}", uploadFile.getSize());
        String originalFileName = uploadFile.getOriginalFilename();
        String fileNameSuffix = originalFileName.substring(originalFileName.indexOf("."));
        String newFileName = UUID.randomUUID()+fileNameSuffix;
        String uploadPath = "D:\\upload\\" + newFileName;
        logger.info("存储路径{}", uploadPath);
        File file = new File(uploadPath);
        if(!file.getParentFile().exists()) {
            file.getParentFile().mkdir();
        }
        try {
            uploadFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    @RequestMapping("/uploadImgAjax")
    @ResponseBody
    public String uploadImgAjax(String imgBase64, String fileFileName) {
        String fileNameSuffix = fileFileName.substring(fileFileName.indexOf("."));
        String newFileName = UUID.randomUUID()+fileNameSuffix;
        String uploadPath = "D:\\upload\\" + newFileName;
        logger.info("存储路径{}", uploadPath);
        File file = new File(uploadPath);
        if(!file.getParentFile().exists()) {
            file.getParentFile().mkdir();
        }
        try {
            OutputStream outputStream  = new FileOutputStream(file);
            imgBase64 = imgBase64.substring(30);
            imgBase64 = URLDecoder.decode(imgBase64,"UTF-8");
            byte[] imgBayte = Base64Utils.decodeFromString(imgBase64);
            outputStream.write(imgBayte);
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
