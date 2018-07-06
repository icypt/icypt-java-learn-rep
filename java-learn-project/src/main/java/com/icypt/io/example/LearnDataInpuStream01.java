package com.icypt.io.example;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 读文件内容,节省空间,逐字节读取
 */
public class LearnDataInpuStream01 {
    public static void main(String[] args) throws Exception{
        String filePath = ClassLoader.getSystemResource("example01.txt").getPath();
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filePath));
        char[] chars = new char[2048];
        for(int i=0; i < chars.length; i++) {
            chars[i] = dataInputStream.readChar();
        }
        dataInputStream.close();
        System.out.println(chars);
    }
}
