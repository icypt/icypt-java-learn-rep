package com.icypt.learn.example.io.file;

import java.io.File;

/**
 * 列出目录下所有的文件
 */
public class ShowDirectoryFileList {
    public static void main(String[] args) {
        File file = new File("D:\\xachyy\\");
        if(file.exists()) {
            String [] files = file.list();
            for(String str : files) {
                System.out.println(str);//文件名称
            }
            File[] files1 = file.listFiles();
            for(File str1 : files1) {
                System.out.println(str1);//文件完整路径
                System.out.println(str1.getName());//文件名称
            }
        } else {
            System.out.println("文件或者文件不存在");
        }
    }
}
