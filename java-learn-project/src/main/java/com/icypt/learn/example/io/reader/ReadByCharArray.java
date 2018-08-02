package com.icypt.learn.example.io.reader;

import java.io.*;

/**
 * 字符流，以字符数组直接读取
 */
public class ReadByCharArray {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\input1.txt");
        Reader reader = new FileReader(file);
        char[] chars = new char[1024];
        int len = reader.read(chars);
        System.out.println(new String(chars, 0, len));
    }
}
