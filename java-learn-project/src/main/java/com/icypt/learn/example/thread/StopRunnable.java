package com.icypt.learn.example.thread;

public class StopRunnable implements Runnable {

    private boolean stop = false;

    @Override
    public void run() {
        for(int i = 0; i < 100 && !stop; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public void stopThread() {
        this.stop = true;
    }

    public static void main(String[] args) {
        StopRunnable stopThread = new StopRunnable();
        Thread thread = new Thread(stopThread);
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 30) {
                thread.start();
            }

            if(i == 60) {
                stopThread.stopThread();
            }
        }
    }
}
