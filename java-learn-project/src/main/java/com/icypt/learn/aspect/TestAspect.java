package com.icypt.learn.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * platform：www.icypt.com
 * Author：Javaroads_Jun
 * createTime： 2019/3/28 21:02
 * version：1.0
 * description：
 */
@Aspect
@Component
public class TestAspect {

    @Pointcut("@annotation(com.icypt.learn.aspect.TestKey)")
    public void process() {

    }

    @Before("process()")
    public void boBefore() {
        System.out.println("********before*********");
    }

    @After("process()")
    public void doAfter() {
        System.out.println("********after*********");
    }
}
