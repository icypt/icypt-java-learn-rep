package com.icypt.io.example.code;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 乱码产生
 */
public class MessyCode {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("file.encoding"));
        File file  = new File("D:\\hello\\new.txt");
        Writer writer = new FileWriter(file);
        writer.write(new String("中国万万岁！ china common！".getBytes("ISO8859-1")));
        writer.close();
    }
}
