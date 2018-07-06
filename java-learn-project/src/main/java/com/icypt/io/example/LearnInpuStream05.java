package com.icypt.io.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 读文件内容,节省空间,逐字节读取
 */
public class LearnInpuStream05 {
    public static void main(String[] args) throws Exception{
        String filePath = ClassLoader.getSystemResource("example.txt").getPath();
        InputStream inputStream = new FileInputStream(filePath);
        byte[] bytes = new byte[2048];
        int count=0;
        int temp=0;
        System.out.println(inputStream.read());
        while((temp = inputStream.read()) != (-1)) {
            bytes[count++] = (byte) temp;
        }
        inputStream.close();
        System.out.println(new String(bytes));

    }
}
