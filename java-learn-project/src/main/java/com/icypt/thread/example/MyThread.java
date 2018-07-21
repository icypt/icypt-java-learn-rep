package com.icypt.thread.example;

public class MyThread extends Thread{


    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 30) {
                Thread thread1 = new MyThread(); //创建一个新的线程  myThread1  此线程进入新建状态
                Thread thread2 = new MyThread(); //创建一个新的线程  myThread2  此线程进入新建状态
                thread1.start();   //调用start()方法使得线程进入就绪状态
                thread2.start();   //调用start()方法使得线程进入就绪状态
            }
        }
    }
}
