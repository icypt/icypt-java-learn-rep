package com.icypt.thread.example.produceconsumer;

import java.util.List;

/**
 * 生产者
 */
public class ProducerRunnable implements Runnable {
    List<String>  container = null;//生产者容器
    Integer maxCount;//最大生产量

    public ProducerRunnable(List<String> container, Integer maxCount) {
        this.container = container;
        this.maxCount = maxCount;
    }

    @Override
    public synchronized void run() {//保证不超出限制
        //开始生产
        for(int i = 0; i < 1000; i++) {//模拟生产
            while(container.size() < maxCount) {
                container.add("产品--"+i);
                System.out.println("已经生产：" + container.size());
            }
        }
    }
}
