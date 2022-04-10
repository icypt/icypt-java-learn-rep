package com.icypt.learn.concurrent;

public class VolatileVisibilityTest {
    public static volatile boolean  initFlag = false;

    public static void main(String[] args) throws Exception {
       new Thread(() -> {
           System.out.println("等待数据更新...");
           while (!initFlag) {
               //等待数据更新
           }
           System.out.println("数据更新成功");
       }).start();

       //2s 准备数据时间
       Thread.sleep(2000);

       new Thread(() ->{updateInitFlag(); }).start();
    }

    public static void updateInitFlag() {
        System.out.println("准备数据...");
        initFlag = true;
        System.out.println("准备数据完成");
    }
}
