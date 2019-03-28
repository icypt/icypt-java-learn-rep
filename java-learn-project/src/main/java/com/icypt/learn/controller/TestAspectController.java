package com.icypt.learn.controller;

import com.icypt.learn.service.SpringContextUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;

@RestController
public class TestAspectController {
    @GetMapping("/testAspect")
    public Object testAspect() throws NoSuchMethodException {
        try {
			//通过完整类名反射加载类
            Class cla = Class.forName("com.icypt.learn.service.TestAspectService");
            //获取首字母小写类名
            String simpleName = cla.getSimpleName();
            String firstLowerName = simpleName.substring(0,1).toLowerCase() + simpleName.substring(1);
            //通过此方法去Spring容器中获取bean实例
            Object obj = SpringContextUtil.getBean(firstLowerName, cla);
			//通过实例反射调用sayHello方法
            obj.getClass().getDeclaredMethod("sayHello").invoke(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return "ok";
    }
}
