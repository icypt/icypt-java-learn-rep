package com.icypt.thread.example;

public class MyRunnableSleep implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        MyRunnableSleep myRunnableSleep = new MyRunnableSleep();
        Thread thread = new Thread(myRunnableSleep);
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 30) {
                thread.start();
                try {
                    Thread.sleep(1); // 使得thread必然能够马上得以执行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
