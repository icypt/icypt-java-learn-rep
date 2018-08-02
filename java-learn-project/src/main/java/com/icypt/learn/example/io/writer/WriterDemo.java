package com.icypt.learn.example.io.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/**
 * 字符流
 * 写入数据
 * */
public class WriterDemo {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter(new File("D:\\input3.txt"));
        writer.write("hello hello");
        writer.close();
    }
}
