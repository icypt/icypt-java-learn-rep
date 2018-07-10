package com.icypt.io.example.printstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamGeneral {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\input3.txt");
        PrintStream printStream = new PrintStream(new FileOutputStream(file));
        printStream.print(true);
        printStream.print("icypt");
        printStream.close();
    }
}
