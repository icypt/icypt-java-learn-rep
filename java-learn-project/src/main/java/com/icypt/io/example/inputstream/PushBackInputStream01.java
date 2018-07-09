package com.icypt.io.example.inputstream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * 回退流
 */
public class PushBackInputStream01 {
    public static void main(String[] args) {
        String input = "abcdef,hjhjddhh";
        PushbackInputStream pbis = null;
        ByteArrayInputStream bis = null;
        bis = new ByteArrayInputStream(input.getBytes());
        pbis = new PushbackInputStream(bis);

        try {
            int temp = 0;
            while((temp = pbis.read()) != -1) {
                if(temp == ',') {
                    pbis.unread(temp);//回退一个字节
                    temp = pbis.read();//再次读取的时候就是回退之前那个字节的值
                    System.out.println("(回退" +(char) temp + ") ");
                }  else {
                    System.out.println((char) temp);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
