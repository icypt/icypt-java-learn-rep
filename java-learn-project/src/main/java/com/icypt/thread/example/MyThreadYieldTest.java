package com.icypt.thread.example;

public class MyThreadYieldTest{
    public static void main(String[] args) {
        Thread thread1 = new MyThreadYield1();
        Thread thread2 = new MyThreadYield2();
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 30) {
                thread1.start();
                thread2.start();
                Thread.yield();
            }
        }
    }
}
