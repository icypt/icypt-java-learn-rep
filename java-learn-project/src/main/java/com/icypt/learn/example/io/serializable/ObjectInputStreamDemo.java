package com.icypt.learn.example.io.serializable;

import java.io.*;

/**
 * 反序列化
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("D:\\hello\\new.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Object object = objectInputStream.readObject();
        System.out.println(object);
        objectInputStream.close();
    }
}
