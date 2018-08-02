package com.icypt.learn.example.io.piped;

import java.io.IOException;
import java.io.PipedOutputStream;
/**
 * 消息发送类
 * */
public class Send implements Runnable {
    PipedOutputStream pipedOutputStream = null;

    /**
     * 无参构造实例化管道输出流实例
     */
    public Send() {
        pipedOutputStream = new PipedOutputStream();
    }

    /**
     * 取得管道输出流事例
     * @return
     */
    public PipedOutputStream getPipedOut() {
        return this.pipedOutputStream;
    }


    public void run() {
        String message = "Hello World!";
        try {
            pipedOutputStream.write(message.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pipedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
