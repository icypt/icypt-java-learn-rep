package com.icypt.example.io.change;



import java.io.*;

/**
 * 将字节输出流转化为字符输出流
 * */
public class ByteStreamChangeToCharStreamOut {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\input3.txt");
         Writer writer = new OutputStreamWriter(new FileOutputStream(file));
         writer.write("Hello java\r\n");
         writer.write("Hello c++\r\n");
         writer.close();
    }
}
