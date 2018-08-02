package com.icypt.learn.example.io.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *Scanner的小例子，从键盘读数据
 * */
public class ScannerDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream(new File("D:\\input1.txt")));
        String str = scanner.nextLine();
        System.out.println(str);
    }
}
