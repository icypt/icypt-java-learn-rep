package com.icypt.learn.java8.lambda;


public interface LambdaInterface {

    /**
     * 接口抽象方法
     * @return
     */
    public String abstractMethod();


    /**
     * 接口默认实现方法
     * @return
     */
    public default String defaultImpl() {
        return "接口默认实现方法，非必须覆写，如果覆写，覆盖默认实现";
    }


}
