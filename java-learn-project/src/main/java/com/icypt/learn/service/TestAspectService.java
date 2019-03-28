package com.icypt.learn.service;

import com.icypt.learn.aspect.TestKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * platform：www.icypt.com
 * Author：Javaroads_Jun
 * createTime： 2019/3/28 20:28
 * version：1.0
 * description：
 */
@Component
public class TestAspectService {

    @Autowired
    private ModuleService moduleService;

    @TestKey(key = "key")
    public void sayHello() {
        System.out.println("************--->************" + moduleService);
    }

}
