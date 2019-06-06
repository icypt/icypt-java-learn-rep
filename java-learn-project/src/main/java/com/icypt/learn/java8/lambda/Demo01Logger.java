package com.icypt.learn.java8.lambda;

import org.junit.Test;

/**
 * platform：
 * Author：guojun.chen
 * createTime： 2019/6/6 11:40
 * version：1.0
 * description：日志案例
 *
 * 发现以下的代码存在一些性能浪费的问题
 * 调用showLog方法，传递的第二个参数是一个拼接之后的字符串
 * 如果等级不是一级，那么拼接字符串就属于浪费操作
 *
 */
public class Demo01Logger {
    //根据日志级别显示日志信息
    public void showLog(int level, String msg) {
        //判断日志等级
        if (level == 1) {
            System.out.println(msg);
        }
    }

    @Test
    public void test1() {
        //定义是三个日志信息
        String msg1 = "Hello ";
        String msg2 = "world ";
        String msg3 = "Java";
        //调用showLog方法，传入日志级别和日志信息
        showLog(1,msg1 + msg2 + msg3);
    }

}
