package com.icypt.io.example.change;



import java.io.*;

/**
 * 将字节输入流变为字符输入流
 * */
public class ByteStreamChangeToCharStreamIn {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\input3.txt");
        Reader reader = new InputStreamReader(new FileInputStream(file));
        char[] c = new char[1024];
        int len = reader.read(c);
        System.out.println(new String(c, 0, len));
        reader.close();
    }
}
