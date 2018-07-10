package com.icypt.io.example.zip;

import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

public class ZipShowMessage {
    public static void main(String [] args) throws IOException {
        File file = new File("D:\\test.zip");
        ZipFile zipFile = new ZipFile(file);
        System.out.println("注释："+zipFile.getComment());
        System.out.println("zip名称："+zipFile.getName());
        System.out.println("zip大小："+zipFile.size());
    }
}
