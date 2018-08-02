package com.icypt.learn.example.io.file;

import java.io.File;

/**
 * 文件删除
 */
public class FileDelete {
    public static void main(String[] args) {
        File file = new File("D:\\tomcat\\new.txt");
        if(file.exists()) {
            file.delete();
        } else {
            System.out.println("文件不存在");
        }
    }
}
