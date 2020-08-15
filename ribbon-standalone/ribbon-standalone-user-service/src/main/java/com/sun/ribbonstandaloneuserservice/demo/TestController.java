package com.sun.ribbonstandaloneuserservice.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @ClassName TestController
 * @Description TODO
 * Author sunhong
 * Date 2020-08-07 15:12
 **/

@RestController
public class TestController {

    //只会注入包含@Qualifier的注解的bean
    @Qualifier
    @Autowired
    List<TestClass> testClass  = Collections.emptyList();

    //自定义的SunHongQualifier没启作用,会加载TestConfiguration配置内的所有bean
    @SunHongQualifier
    @Autowired
    List<TestClass> testClassList = Collections.emptyList();


    @RequestMapping("/test")
    public String test(){
        System.out.println(testClass);
        return "";
    }
}
