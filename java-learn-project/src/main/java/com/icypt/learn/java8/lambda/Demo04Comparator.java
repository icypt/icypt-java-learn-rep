package com.icypt.learn.java8.lambda;

import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 方法返回值为函数式接口，使用Lambda表达式
 */
public class Demo04Comparator {
    public static Comparator<String> customComparator() {
        //匿名内部类实现
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        };
        //Lambda表达式实现
       /* return (String o1, String o2) -> {
            return o2.compareTo(o1);
        };*/
        //Lambda表达式优化
        return (o1, o2) -> o2.compareTo(o1);
    }

    public static void main(String[] args) {
        String[] strAry = {"a", "b", "c"};
        System.out.println(Arrays.asList(strAry).toString());
        Arrays.sort(strAry, customComparator());
        System.out.println(Arrays.asList(strAry).toString());
    }
}







