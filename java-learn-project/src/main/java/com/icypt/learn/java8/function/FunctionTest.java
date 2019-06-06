package com.icypt.learn.java8.function;

import com.icypt.learn.java8.function.impl.MyFunctionalInterfaceImpl;
import org.junit.Test;

/**
 * platform：
 * Author：guojun.chen
 * createTime： 2019/6/6 11:14
 * version：1.0
 * description：函数式接口测试
 */
public class FunctionTest {

    public void show(MyFunctionalInterface myFunctionalInterface) {
        myFunctionalInterface.method();
    }

    @Test
    public void test1() {
        //调用show方法，方法的参数是接口，所以就可传实现类对象
        this.show(new MyFunctionalInterfaceImpl());
        //调用show方法，方法的参数是接口，所以就可传接口的匿名内部类
        this.show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });
        //调用show方法，方法的参数是一个函数式接口，所以可以使用lambda表达式
        show(() -> {
            System.out.println("使用Lambda表达式重写接口中的抽象方法");
        });
        //简化Lambda表达式
        show(() -> System.out.println("使用简化Lambda表达式重写接口中的抽象方法"));
    }
}
