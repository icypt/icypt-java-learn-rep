package com.icypt.learn.jvm;

import java.util.ArrayList;

public class HeapTest {
    byte[] a = new byte[1024 * 100]; //100kb

    public static void main(String[] args) throws Exception{
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(new HeapTest());
            Thread.sleep(5);
        }
    }
}
