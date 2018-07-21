package com.icypt.thread.example;

public class MyThreadYield1 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " yield1--" + i);
        }
    }
}
