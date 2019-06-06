package com.icypt.learn.java8.function;

/**
 * 函数式接口：有且只有一个抽象方法的接口，称之为函数式接口
 * 接口中可以包含其他的方法（默认方法、静态方法，私有方法）
 * @FunctionalInterface：检测接口是否是一个函数式接口
 */
@FunctionalInterface
public interface MyFunctionalInterface {
    public abstract void method();
}
