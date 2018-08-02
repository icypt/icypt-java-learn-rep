package com.icypt.learn.example.io.zip;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamSingleFile {
   public static void main(String[] args) throws IOException{
       File file = new File("D:\\input.txt");
       File zipFile = new File("D:\\test.zip");

       InputStream inputStream = new FileInputStream(file);
       ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFile));
       //设置注释
       zipOutputStream.setComment("hello zip");
       zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
       int temp = 0;
       while((temp = inputStream.read()) != -1) {
            zipOutputStream.write(temp);
       }

       inputStream.close();
       zipOutputStream.close();

       System.out.println("===============压缩完成=================");
    }
}
