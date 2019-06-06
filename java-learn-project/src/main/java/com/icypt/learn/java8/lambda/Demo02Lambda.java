package com.icypt.learn.java8.lambda;

import org.junit.Test;

/**
 * platform：
 * Author：guojun.chen
 * createTime： 2019/6/6 14:05
 * version：1.0
 * description：使用Lambda优化日志案例，Lambda特点：延迟加载
 * Lambda使用前提：必须使用函数式接口
 */
public class Demo02Lambda {
    /**
     * 定义一个显示日志的方法，传入日志的等级以及MessageBuilder接口
     */
    public  void showLog(int level, MessageBuilder messageBuilder) {
        //对日志的等级进行判断，如果是1，则调用MessageBuilder的buildString方法输出信息
        if(level == 1) {
            System.out.println(messageBuilder.buildMsg());
        }

    }

    @Test
    public void test() {
        //定义是三个日志信息
        String msg1 = "Hello ";
        String msg2 = "world ";
        String msg3 = "Java";
        //调用showLog方方法，参数MessageBuilder是一个函数式接口，所以可以传入Lambda表达式
        showLog(1,() -> {
            //返回一个拼接的字符串
            return msg1 + msg2 +msg3;
        });
    }
}
