package com.icypt.learn.example.io.piped;
import java.io.IOException;

/**
 * 测试类
 * */
public class TestPiped {
    public static void main(String[] args) {
        Send send = new Send();
        Receive receive = new Receive();
        try {
            //管道连接
            send.getPipedOut().connect(receive.getReceive());
            new Thread(send).start();
            new Thread(receive).start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Thread(send).start();
        new Thread(receive).start();
    }
}
