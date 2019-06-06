package com.icypt.learn.java8.lambda;

import org.junit.Test;

import java.util.*;


public class LambdaExample {

    //成员属性
    private String h = "hhhhhh";

    @Test
    public void example1() {
        /**
         * 参数Result的类型是由编译器推理得出
         */
        Arrays.asList("a", "b", "c").forEach(result -> System.out.println(result));
    }

    @Test
    public void example2() {
        /**
         * 显示指定传入参数的类型
         */
        Arrays.asList("a", "b", "c").forEach((String result) -> System.out.println(result));
    }

    @Test
    public void example3() {
        /**
         * 如果Lambda表达式需要更复杂的语句块，可以将语句块使用花括号包起来，类似于Java 方法体
         */
        Arrays.asList("a", "b", "c").forEach((String result) -> {
            if("a".equalsIgnoreCase(result)) {
                System.out.println(result);
            }
        });
    }

    @Test
    public void example4() {
        //局部变量
        int i = 111;
        /**
         * Lambda表达式可以使用局部变量和类成员变量(会将这些变量隐式转成final的)
         */
        Arrays.asList("a", "b", "c").forEach((String result) -> {
            System.out.println(result + i + this.h);
        });
    }

    @Test
    public void example5() {
        List<String> strList = Arrays.asList("a", "b", "c");
        strList.sort((e1,e2) -> e1.compareTo(e2));
        //列表转置，适用于引用类型，非引用类型不能使用
        Collections.reverse(strList);
        strList.forEach(result -> System.out.println(result));
    }

    @Test
    public void example6() {
        /**
         * 如果Optional实例持有一个非空值，则isPresent()方法返回true，否则返回false；orElseGet()方法，
         * Optional实例持有null，则可以接受一个lambda表达式生成的默认值；
         * map()方法可以将现有的Opetional实例的值转换成新的值；orElse()方法与orElseGet()方法类似，但是在持有null的时候返回传入的默认值。
         */
        Optional< String > fullName = Optional.ofNullable( "" );
        System.out.println( "Full Name is set? " + fullName.isPresent() );
        System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) );
        System.out.println( fullName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
    }

}
