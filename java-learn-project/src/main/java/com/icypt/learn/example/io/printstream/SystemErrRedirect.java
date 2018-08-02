package com.icypt.learn.example.io.printstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
/**
 *System.err重定向这个例子也提示我们可以使用这种方法保存错误信息
 * */
public class SystemErrRedirect {
    public static void main(String[] args) throws FileNotFoundException {
        System.err.println("hello io");
        System.setErr(new PrintStream(new FileOutputStream(new File("D:\\input3.txt"))));
        System.err.println("这些都是错误信息，输出到文件中去！");
    }
}
