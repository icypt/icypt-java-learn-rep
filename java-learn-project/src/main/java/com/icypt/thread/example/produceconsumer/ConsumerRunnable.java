package com.icypt.thread.example.produceconsumer;

/**
 * 消费者
 */
public class ConsumerRunnable implements Runnable {
    ShopInfo shopInfo;

    public ConsumerRunnable(ShopInfo shopInfo) {
        this.shopInfo = shopInfo;
    }

    @Override
    public void run() {
        shopInfo.consumer();
    }
}
