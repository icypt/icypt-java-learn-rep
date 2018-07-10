package com.icypt.io.example.printstream;

import java.io.*;

/**
 * 为System.out.println()重定向输出
 * */
public class SystemOutRedirect {
    public static void main(String[] args) throws IOException {
        //直接输出到屏幕
        System.out.println("java io");
        //重定向
        System.setOut(new PrintStream(new FileOutputStream(new File("D:\\input3.txt"))));
        System.out.println("这些在文件中才能看见");
    }
}
