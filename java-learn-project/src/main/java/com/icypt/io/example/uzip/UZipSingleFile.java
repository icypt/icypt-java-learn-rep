package com.icypt.io.example.uzip;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class UZipSingleFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\uzip\\test.zip");
        OutputStream outputStream = new FileOutputStream("D:\\uzip\\input.txt");
        InputStream inputStream = null;
        ZipFile zipFile = new ZipFile(file);
        ZipEntry zipEntry = zipFile.getEntry("input.txt");
        //取得被压缩文件的输入流
        inputStream = zipFile.getInputStream(zipEntry);
        int temp = 0;
        while((temp = inputStream.read()) != -1) {
            outputStream.write(temp);
        }

        inputStream.close();
        outputStream.close();

        System.out.println("单个文件解压完成");
    }
}
