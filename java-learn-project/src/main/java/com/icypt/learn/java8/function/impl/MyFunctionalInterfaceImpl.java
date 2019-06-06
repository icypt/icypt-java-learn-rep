package com.icypt.learn.java8.function.impl;

import com.icypt.learn.java8.function.MyFunctionalInterface;

/**
 * platform：
 * Author：guojun.chen
 * createTime： 2019/6/6 11:11
 * version：1.0
 * description：
 */
public class MyFunctionalInterfaceImpl implements MyFunctionalInterface {
    @Override
    public void method() {
        System.out.println("使用实现类实现接口中的抽象方法");
    }
}
