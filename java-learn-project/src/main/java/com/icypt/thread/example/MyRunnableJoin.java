package com.icypt.thread.example;

public class MyRunnableJoin implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        MyRunnableJoin myRunnableJoin = new MyRunnableJoin();
        Thread thread = new Thread(myRunnableJoin);
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 30) {
                thread.start();
                try {
                    thread.join();//等子线程运行完毕后，主线程再运行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
