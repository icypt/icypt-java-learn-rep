package com.icypt.io.example.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 读文件内容,节省空间
 */
public class InputStreamInitArrayByFileLength1 {
    public static void main(String[] args) throws Exception{
        String filePath = ClassLoader.getSystemResource("example.txt").getPath();
        File file = new File(filePath);
        InputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[(int)file.length()];
        inputStream.read(bytes);
        inputStream.close();
        System.out.println(new String(bytes));
    }
}
