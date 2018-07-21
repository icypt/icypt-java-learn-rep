package com.icypt.thread.example;

public class MyThreadYield2 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " yield2--" + i);
        }
    }
}
