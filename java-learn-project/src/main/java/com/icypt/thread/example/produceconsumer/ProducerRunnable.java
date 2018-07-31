package com.icypt.thread.example.produceconsumer;

import java.util.List;

/**
 * 生产者
 */
public class ProducerRunnable implements Runnable {
    ShopInfo shopInfo;

    public ProducerRunnable(ShopInfo shopInfo) {
        this.shopInfo = shopInfo;
    }

    @Override
    public void run() {//保证不超出限制
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //开始生产
        shopInfo.produce();
    }
}
