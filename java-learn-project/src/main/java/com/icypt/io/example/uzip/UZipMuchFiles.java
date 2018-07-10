package com.icypt.io.example.uzip;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class UZipMuchFiles {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\uzip\\muchfiles.zip");
        OutputStream outputStream = null;
        InputStream inputStream = null;
        ZipFile zipFile = new ZipFile(file);
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
        ZipEntry zipEntry = null;
        File outFile = null;
        while ((zipEntry = zipInputStream.getNextEntry()) != null) {
            System.out.println("文件名称："+zipEntry.getName());
            outFile = new File("D:\\uzip\\"+zipEntry.getName());
            if(!outFile.getParentFile().exists()) {
                outFile.getParentFile().mkdir();
            }

            if(!outFile.exists()) {
                outFile.createNewFile();
            }

            inputStream = zipFile.getInputStream(zipEntry);
            outputStream = new FileOutputStream(outFile);

            int temp = 0;

            while((temp = inputStream.read()) != -1) {
                outputStream.write(temp);
            }

            inputStream.close();
            outputStream.close();
        }
    }
}
