package com.icypt.io.example.outputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
/**
 * 字节流
 * 向文件中追加新内容：
 * */
public class OutPutStreamAddNewContent {
    public static void main(String[] args) throws Exception{
        String filePath = "D:\\output.txt";
        File file = new File(filePath);
        OutputStream ops = new FileOutputStream(file, true);//true表示追加，false表示不追加
        byte[] bytes = "asdfjkl;".getBytes();
        for(int i=0; i < bytes.length; i++) {
            ops.write(bytes[i]);
        }
        ops.close();
        System.out.println("======写入结束========");
    }
}
