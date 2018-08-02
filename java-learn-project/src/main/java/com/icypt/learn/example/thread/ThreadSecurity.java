package com.icypt.learn.example.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSecurity {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNo("大国的卡");
        account.setBalance(6.00);
        DrawMoneyRunnable drawMoneyRunnable = new DrawMoneyRunnable(account, 5.50);
        Thread thread1 = new Thread(drawMoneyRunnable);
        Thread thread2 = new Thread(drawMoneyRunnable);
        Thread thread3 = new Thread(drawMoneyRunnable);
        thread1.start();
//        thread2.start();
        thread3.start();
    }
}

class Account {
    private String accountNo;
    private Double balance;

    public Account() {}

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}

class DrawMoneyRunnable implements Runnable {
    private Account account;
    private Double drawMoney;

    public DrawMoneyRunnable(Account account, Double drawMoney) {
        super();
        this.account = account;
        this.drawMoney = drawMoney;
    }

    // 显示定义Lock同步锁对象，此对象与共享资源具有一对一关系
    private final Lock lock = new ReentrantLock();

    @Override
    public  void run() {
        lock.lock();
        if(account.getBalance() >= drawMoney) {
            System.out.println("取钱成功，取出：" + drawMoney);
            double balance = account.getBalance() - drawMoney;
            account.setBalance(balance);
            System.out.println("余额为：" + balance);
        }
        lock.unlock();
    }
}