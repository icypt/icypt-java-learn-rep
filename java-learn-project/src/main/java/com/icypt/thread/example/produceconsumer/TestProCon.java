package com.icypt.thread.example.produceconsumer;

import java.util.ArrayList;

public class TestProCon {
    public static void main(String[] args) {
        ShopInfo shopInfo = new ShopInfo();
        ProducerRunnable producerRunnable = new ProducerRunnable(shopInfo);
        ConsumerRunnable consumerRunnable = new ConsumerRunnable(shopInfo);
        Thread proThread1 = new Thread(producerRunnable);
        Thread proThread2 = new Thread(producerRunnable);
        Thread conThread3 = new Thread(consumerRunnable);
        Thread conThread4 = new Thread(consumerRunnable);
        Thread conThread5 = new Thread(consumerRunnable);
        proThread1.start();
        proThread2.start();
        conThread3.start();
        conThread4.start();
        conThread5.start();
    }
}
