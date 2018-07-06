package com.icypt.io.example;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 字节流，读取文件内容
 */
public class LearnInpuStream01 {
    public static void main(String[] args) throws Exception{
        String filePath = ClassLoader.getSystemResource("example.txt").getPath();
        InputStream inputStream = new FileInputStream(filePath);
        byte[] bytes = new byte[2048];
        inputStream.read(bytes);
        inputStream.close();
        System.out.println(new String(bytes));
    }
}
