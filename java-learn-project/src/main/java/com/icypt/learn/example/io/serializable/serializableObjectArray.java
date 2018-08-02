package com.icypt.learn.example.io.serializable;

import java.io.*;

public class serializableObjectArray {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("D:\\hello\\new.txt");
        Person [] persons = new Person[] {new Person("xxx", 9),new Person("xx1", 10),new Person("xx2", 11)};
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(persons);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Object[] objects = (Object[])objectInputStream.readObject();
        for (Object o : objects) {
            System.out.println(o);
        }
    }
}
