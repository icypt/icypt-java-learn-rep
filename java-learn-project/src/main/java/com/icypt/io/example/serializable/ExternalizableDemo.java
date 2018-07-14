package com.icypt.io.example.serializable;

import java.io.*;

public class ExternalizableDemo {
    public static void main(String[] args) throws Exception{
        ser();
        dser();
    }

    //序列化
    public static void ser() throws Exception {
        File file = new File("D:\\hello\\new.txt");
        ExternalizableDemo externalizableDemo = new ExternalizableDemo();
        ObjectOutputStream objectOuputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOuputStream.writeObject(new Person("zhangsan", 10));
        objectOuputStream.close();
    }

    //反序列化
    public static void dser() throws Exception {
        File file = new File("D:\\hello\\new.txt");
        ExternalizableDemo externalizableDemo = new ExternalizableDemo();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Person person =  (Person) objectInputStream.readObject();
        System.out.println(person.toString());
        objectInputStream.close();
    }
}

class Person implements Externalizable {

    private String name;
    private Integer age;

    public Person() {}

    public Person(String name, Integer age) {
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


    //定制序列化
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.name);
        out.writeInt(10);
    }

    //定制反序列化
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = (String)in.readObject();
        this.age = in.readInt();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
