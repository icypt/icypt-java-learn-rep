package com.icypt.io.example.reader;

import java.io.*;

/**
 * 字符流水，循环读取
 */
public class ReadByChar {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\input1.txt");
        Reader reader = new FileReader(file);
        char[] chars = new char[1024];
        int temp = 0;
        int count = 0;
        while((temp = reader.read()) != -1) {
            chars[count] = (char) temp;
            count++;
        }
        reader.close();

        System.out.println(new String(chars, 0, count));
    }
}
