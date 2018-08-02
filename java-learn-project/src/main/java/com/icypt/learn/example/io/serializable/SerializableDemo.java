package com.icypt.learn.example.io.serializable;

import java.io.Serializable;

/**
 * 实现具有序列化能力的类
 */
public class SerializableDemo implements Serializable {
    public SerializableDemo() {}

    private String name ;
    private Integer age;
    private Double salary;

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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

