package com.icypt.io.example.randomaccessfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RandomAccessFile写入文件
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\hello\\new.txt");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        randomAccessFile.write("asdfgs".getBytes());
        randomAccessFile.writeBoolean(false);
        randomAccessFile.writeChar('c');
        randomAccessFile.writeDouble(2.1);
        randomAccessFile.writeFloat(1.1f);
        randomAccessFile.writeInt(10);
        randomAccessFile.close();
    }
}
