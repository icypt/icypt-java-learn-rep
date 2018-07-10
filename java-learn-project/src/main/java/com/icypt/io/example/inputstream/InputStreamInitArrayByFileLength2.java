package com.icypt.io.example.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 读文件内容,节省空间,逐字节读取
 */
public class InputStreamInitArrayByFileLength2 {
    public static void main(String[] args) throws Exception{
        String filePath = ClassLoader.getSystemResource("example.txt").getPath();
        File file = new File(filePath);
        InputStream inputStream = new FileInputStream(file);
        System.out.println("文件长度："+ file.length());
        byte[] bytes = new byte[(int)file.length()];
        for(int i=0; i<bytes.length; i++) {
            bytes[i] = (byte) inputStream.read();
        }
        inputStream.close();
        System.out.println(new String(bytes));
    }
}
