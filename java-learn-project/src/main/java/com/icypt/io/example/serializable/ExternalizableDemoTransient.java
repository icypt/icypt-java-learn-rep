package com.icypt.io.example.serializable;

import java.io.*;

public class ExternalizableDemoTransient {
    public static void main(String[] args) throws Exception{
        ser();
        dser();
    }

    //序列化
    public static void ser() throws Exception {
        File file = new File("D:\\hello\\new.txt");
        ObjectOutputStream objectOuputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOuputStream.writeObject(new Person1("zhangsan", 10));
        objectOuputStream.close();
    }

    //反序列化
    public static void dser() throws Exception {
        File file = new File("D:\\hello\\new.txt");
        ExternalizableDemo externalizableDemo = new ExternalizableDemo();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Person1 person1 =  (Person1) objectInputStream.readObject();
        System.out.println(person1.toString());
        objectInputStream.close();
    }
}

class Person1 implements Serializable {

    private transient String name;
    private Integer age;

    public Person1() {}

    public Person1(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
