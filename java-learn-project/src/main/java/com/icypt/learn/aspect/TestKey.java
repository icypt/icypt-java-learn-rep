package com.icypt.learn.aspect;

import java.lang.annotation.*;

/**
 * platform：www.icypt.com
 * Author：Javaroads_Jun
 * createTime： 2019/3/28 20:25
 * version：1.0
 * description：
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TestKey {
    String key() default "";
}
