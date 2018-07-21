package com.icypt.thread.example.produceconsumer;

import java.util.ArrayList;

public class TestProCon {
    public static void main(String[] args) {
        ProducerRunnable producerRunnable= new ProducerRunnable(new ArrayList<String>(), 1000000);
        Thread thread1 = new Thread(producerRunnable);
        Thread thread2 = new Thread(producerRunnable);
        thread1.start();
        thread2.start();
    }
}
