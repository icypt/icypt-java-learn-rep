package com.icypt.io.example.outputstream;

import java.io.*;

/**
 * 数据输出流
 */
public class DataOutputStream02 {
    public static void main(String[] args) throws Exception{
        //取得类加载路径
        String filePath = "D:\\test.txt";
        File file = new File(filePath);
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        String[] names = {"衬衣", "手套", "围巾"};
        float[] prices = {98.3f, 23.5f, 66.4f};
        int nums[] = {3,2,1} ;    // 商品数量
        for(int i=0; i < names.length; i++) {
            dataOutputStream.writeChars(names[i]);
            dataOutputStream.writeChars("\t");
            dataOutputStream.writeFloat(prices[i]);
            dataOutputStream.writeChars("\t");
            dataOutputStream.writeInt(nums[i]);
            dataOutputStream.writeChars("\n");
        }
        dataOutputStream.close() ;    // 关闭输出流
    }
}
