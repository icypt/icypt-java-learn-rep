package com.icypt.io.example.file;

import java.io.File;
import java.io.IOException;

/**
 * 使用常量创建文件
 */
public class FileCreateUseConstants {
    public static void main(String[] args) throws IOException {
        File file = new File("D:" + File.separator + "tomcat" + File.separator + "new.txt");
        file.createNewFile();
    }
}
