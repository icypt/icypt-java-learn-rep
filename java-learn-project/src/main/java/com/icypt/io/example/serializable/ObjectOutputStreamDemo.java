package com.icypt.io.example.serializable;

import java.io.*;

public class ObjectOutputStreamDemo implements Serializable{
    private String name;
    private Integer age;

    public ObjectOutputStreamDemo(FileOutputStream fileOutputStream) {}

    public ObjectOutputStreamDemo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名='" + name + '\'' + ", 年龄=" + age;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\hello\\new.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(new ObjectOutputStreamDemo("zhangsan", 10));
        objectOutputStream.close();
    }
}
