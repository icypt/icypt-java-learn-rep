package com.icypt.io.example.reader;

import java.util.Scanner;
/**
 *Scanner的小例子，从键盘读数据
 * */
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //读取整数
        int temp = scanner.nextInt();
        System.out.println(temp);
        //读取浮点数
        float f = scanner.nextFloat();
        System.out.println(f);
    }
}
