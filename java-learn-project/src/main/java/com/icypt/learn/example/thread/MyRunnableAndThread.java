package com.icypt.learn.example.thread;

public class MyRunnableAndThread {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "" + i);
            if(i == 30) {
                Runnable runnable = new MyRunnable();
                Thread thread1 = new MyThreadAddConstruction(runnable);
                Thread thread2 = new MyThreadAddConstruction(runnable);
                thread1.start();
                thread2.start();
            }
        }
    }
}
