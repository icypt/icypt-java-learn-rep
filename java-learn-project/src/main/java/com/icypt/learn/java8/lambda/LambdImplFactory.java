package com.icypt.learn.java8.lambda;

import java.util.function.Supplier;

/**
 * platform：
 * Author：guojun.chen
 * createTime： 2019/6/5 10:19
 * version：1.0
 * description：
 */
public interface LambdImplFactory {

    /**
     * 接口静态方法，接受接口实例
     * @param supplier
     * @return
     */
    public static LambdaInterface crateLambdIntefaceTarget(Supplier<LambdaInterface> supplier) {
        return supplier.get();
    }

    /**
     * 下面的代码片段整合了默认方法和静态方法的使用场景：
     * @param args
     */
    public static void main(String[] args) {
        //LambdImplFactory通过接口静态方法获取LambdaInterfaceImpl实例
        LambdaInterface lambdaInterface = LambdImplFactory.crateLambdIntefaceTarget(LambdaInterfaceImpl::new);
        //调用接口默认实现方法
        System.out.println(lambdaInterface.defaultImpl());
        //调用接口抽象方法
        System.out.println(lambdaInterface.abstractMethod());

    }
}
