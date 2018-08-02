package com.icypt.learn.example.io.outputstream;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
/**
 * 使用内存操作流将一个大写字母转化为小写字母
 * */
public class BateArrayOutputStreamFinshToLowerCase {
    public static void main(String[] args) throws Exception{
        String input = "ICYPTLH";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int temp = 0;
        while((temp =byteArrayInputStream.read()) != -1) {
            char ch = (char) temp;
            byteArrayOutputStream.write(Character.toLowerCase(ch));
        }
        String outString = byteArrayOutputStream.toString();
        byteArrayInputStream.close();;
        byteArrayOutputStream.close();
        System.out.println(outString);
    }
}
