package com.icypt.io.example.file;

import java.io.File;
import java.io.IOException;

/**
 * 文件创建
 */
public class FileCreate {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\input4.txt");
        while(!file.exists()) {
            file.createNewFile();
        }
    }
}
