package com.icypt.learn.example.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Callable<Integer> callable = new MyCallable(); // 创建MyCallable对象
        FutureTask<Integer> ft = new FutureTask<Integer>(callable); //使用FutureTask来包装MyCallable对象
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 30) {
                Thread thread = new Thread(ft);//FutureTask对象作为Thread对象的target创建新的线程

                thread.start();//线程进入到就绪状态
            }
        }

        System.out.println("主线程for循环执行完毕..");

        try {
           int sum =  ft.get();
            System.out.println("线程执行结果sum="+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
