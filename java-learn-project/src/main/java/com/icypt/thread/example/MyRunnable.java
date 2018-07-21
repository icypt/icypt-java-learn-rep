package com.icypt.thread.example;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("进myRunnable");
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 30) {
                Runnable runnable = new MyRunnable();
                Thread thread1 = new Thread(runnable); // 将myRunnable作为Thread target创建新的线程
                Thread thread2 = new Thread(runnable); // 将myRunnable作为Thread target创建新的线程
                thread1.start();   //调用start()方法使得线程进入就绪状态
                thread2.start();   //调用start()方法使得线程进入就绪状态
            }
        }
    }
}

