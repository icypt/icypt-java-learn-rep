package com.icypt.thread.example;

public class MyThreadPriority extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new MyThreadPriority();
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 30) {
                thread.setPriority(Thread.MAX_PRIORITY);//设置优先级，此优先级，只是加大了执行的可能性，并非优先执行
                thread.start();
            }
        }
    }
}
