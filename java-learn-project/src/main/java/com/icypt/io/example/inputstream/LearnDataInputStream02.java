package com.icypt.io.example.inputstream;

import java.io.*;

/**
 * 数据输入流
 */
public class LearnDataInputStream02 {
    public static void main(String[] args) throws Exception{
        String filePath = "D:\\test.txt";
        File file = new File(filePath);
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));

        String name = "";
        float price = 0.0f;
        int num = 0;
        char[] temp = null;
        int len = 0;
        char c = 0;
        try {
            while(true) {
                len = 0;
                temp = new char[2000];
                while((c = dataInputStream.readChar()) != '\t') {
                    temp[len] = c;
                    len ++;
                }
                name = new String(temp,0,len);//"名称+\t"
                price = dataInputStream.readFloat();//"价格"
                dataInputStream.readChar();//"\t"
                num = dataInputStream.readInt();//"数量"
                dataInputStream.readChar();//"\n"
                System.out.printf("名称:%s;价格:%5.2f;数量:%d\n",name,price,num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        dataInputStream.close();
    }
}
