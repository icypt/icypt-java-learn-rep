package com.icypt.io.example.inputstream;

import java.io.*;

/**
 * 将inputStream1和inputStream2合并输出到
 */
public class SequenceInputStream01 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\input1.txt");
        File file2 = new File("D:\\input2.txt");
        File file3 = new File("D:\\input3.txt");
        InputStream inputStream1 = new FileInputStream(file1);
        InputStream inputStream2 = new FileInputStream(file2);
        OutputStream outputStream = new FileOutputStream(file3);
        //合并输入流
        SequenceInputStream sequenceInputStream = new SequenceInputStream(inputStream1,inputStream2);
        int temp = 0;
        while ((temp = sequenceInputStream.read()) != -1) {
            outputStream.write(temp);
        }

        inputStream1.close();
        inputStream2.close();
        outputStream.close();

        System.out.println("=============合并完毕==============");

    }
}
