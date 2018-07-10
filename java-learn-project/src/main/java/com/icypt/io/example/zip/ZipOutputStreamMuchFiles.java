package com.icypt.io.example.zip;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamMuchFiles {
   public static void main(String[] args) throws IOException{

       File file = new File("D:\\testzip");
       File zipFile = new File("D:\\muchfiles.zip");
       InputStream inputStream = null;
       ZipOutputStream zipOutputStream = null;
       if(!file.exists()) {
           System.out.println("文件不存在！");
       }

       if(!file.isDirectory()) {
           System.out.println("不是文件夹！");
       }

       File[] files = file.listFiles();

       if(files != null && files.length > 0) {
           zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFile));
           zipOutputStream.setComment("多个文件压缩测试");
           for(File file1 : files) {
               inputStream = new FileInputStream(file1);
               zipOutputStream.putNextEntry(new ZipEntry(file1.getName()));
               int temp = 0;
               while((temp = inputStream.read()) != -1) {
                   zipOutputStream.write(temp);
               }
           }
       }

       inputStream.close();
       zipOutputStream.close();

       System.out.println("===============压缩完成=================");
    }
}
