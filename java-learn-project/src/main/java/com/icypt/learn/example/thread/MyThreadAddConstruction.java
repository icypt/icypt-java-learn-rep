package com.icypt.learn.example.thread;

public class MyThreadAddConstruction extends Thread{

    public MyThreadAddConstruction(Runnable runnable) {
        super(runnable);
    }

    @Override
    public void run() {
        System.out.println("进myThread");
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
