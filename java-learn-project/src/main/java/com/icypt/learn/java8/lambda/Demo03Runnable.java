package com.icypt.learn.java8.lambda;

import org.junit.Test;

/**
 * platform：
 * Author：guojun.chen
 * createTime： 2019/6/6 14:41
 * version：1.0
 * description：例如java.lang.Runnable是一个函数式接口，
 * 假设有一个startThread类的构造方法参数为Runnable没有本质区别
 */
public class Demo03Runnable {
    public static  void startThread(Runnable runnable) {
        //开启多线程
        new Thread(runnable).start();
    }


    public static void main(String[] args) {
        //调用startThead方法，方法的参数是一个接口，可以使用该接口的匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-->线程启动了");
            }
        });

        //调用startThead方法，方法的参数是一个函数式接口，可以使用Lambda表达式
        startThread(() -> System.out.println(Thread.currentThread().getName() + "-->线程启动了"));
    }
}







