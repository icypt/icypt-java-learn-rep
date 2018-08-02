package com.icypt.learn.example.io.piped;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * 接收类
 */
public class Receive implements Runnable {

    PipedInputStream pipedInputStream = null;

    public Receive() {
        pipedInputStream = new PipedInputStream();
    }

    public PipedInputStream getReceive() {
        return this.pipedInputStream;
    }

    public void run() {
        byte[] bytes = new byte[1024];
        int len = 0;
        try {
            len = pipedInputStream.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pipedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("接受的内容为 "+(new String(bytes,0,len)));
    }
}
