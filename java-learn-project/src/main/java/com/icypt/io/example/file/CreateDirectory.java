package com.icypt.io.example.file;

import java.io.File;

/**
 * 创建目录
 */
public class CreateDirectory {
    public static void main(String[] args) {
        File file = new File("D:\\hello");
        if(!file.exists()) {
            file.mkdir();
        } else {
            System.out.println("目录存在");
        }
    }
}
