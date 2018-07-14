package com.icypt.io.example.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 使用缓冲区从键盘上读入内容
 * */
public class BufferedReadderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        System.out.println("请输入内容");
        str = bufferedReader.readLine();
        System.out.println(str);
    }
}
