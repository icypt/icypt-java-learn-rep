package com.icypt.thread.example.produceconsumer;

import java.util.ArrayList;
import java.util.List;

public class ShopInfo {
    private List<String> container = new ArrayList<String>();
    private Integer maxProduceCount = 5;
    private Integer consumerCount = 0;

    public synchronized  void produce() {
        while(container.size() <= maxProduceCount) {
            System.out.println("生产第" + (container.size()+1) + "产品");
            container.add("产品--" + container.size());
        }
    }

    public  synchronized void consumer() {
        while (container != null && consumerCount <= container.size()) {
            System.out.println("消费第" + (consumerCount+1 ) + "产品");
            consumerCount ++;
        }
        StringBuffer stringBuffer = new StringBuffer();

    }
}
