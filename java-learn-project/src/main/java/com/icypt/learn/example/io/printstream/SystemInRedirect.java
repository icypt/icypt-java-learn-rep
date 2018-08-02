package com.icypt.learn.example.io.printstream;

import java.io.*;

/**
 *System.in重定向
 * */
public class SystemInRedirect {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\input1.txt");
        System.setIn(new FileInputStream(file));

        byte[] bytes = new byte[1024];
        int len = System.in.read(bytes);
        System.out.println(new String(bytes,0, len));
    }
}
