package com.icypt.io.example.file;

import java.io.File;

/**
 * 列出指定文件夹下的所有文件包括文件夹
 */
public class ShowAllFileByRecurrence {
    public static void main(String[] args) {
        File file = new File("D:\\Program Files (x86)\\DTLSoft\\");
        if(file.exists()) {
            print(file);
        } else {
            System.out.println("文件或者文件夹不存在");
        }
    }

    public static void print(File file) {
        System.out.println(file.getAbsolutePath());
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println(file1.getName());
            } else {
                print(file1);
            }
        }


    }
}
