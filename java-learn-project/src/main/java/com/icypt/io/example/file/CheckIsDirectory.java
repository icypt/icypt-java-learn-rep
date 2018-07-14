package com.icypt.io.example.file;

import java.io.File;

/**
 * 检查是不是目录
 */
public class CheckIsDirectory {
    public static void main(String[] args) {
        File file = new File("D:\\hello");
        if(file.exists()) {
            if(file.isDirectory()) {
                System.out.println("是文件夹");
            } else {
                System.out.println("不是文件夹");
            }
        } else {
            System.out.println("文件不存在");
        }
    }
}
