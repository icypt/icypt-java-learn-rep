package com.icypt.learn.example.io.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 字节流，读取文件内容
 */
public class InputStreamGetLength {
    public static void main(String[] args) throws Exception{
        String filePath = ClassLoader.getSystemResource("example.txt").getPath();
        InputStream inputStream = new FileInputStream(filePath);
        byte[] bytes = new byte[2048];
        int len = inputStream.read(bytes);
        inputStream.close();
        System.out.println("读入的长度为："+len);
        System.out.println(new String(bytes,0, len));
    }
}
