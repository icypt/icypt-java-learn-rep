package com.icypt.io.example.printstream;

import java.io.*;

/**
 * 使用OutputStream向屏幕上输出内容
 * */
public class SystemOut {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = System.out;
        outputStream.write("hello world!".getBytes());
        outputStream.close();
    }
}
