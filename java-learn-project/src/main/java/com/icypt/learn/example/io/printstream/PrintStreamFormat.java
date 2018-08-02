package com.icypt.learn.example.io.printstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
/**
 * 使用PrintStream进行输出
 * 并进行格式化
 * */
public class PrintStreamFormat {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\input3.txt");
        PrintStream printStream = new PrintStream(new FileOutputStream(file));
        int age = 20;
        printStream.printf("姓名：%s，年龄：%d.", "icypt", age);
        printStream.close();
    }
}
