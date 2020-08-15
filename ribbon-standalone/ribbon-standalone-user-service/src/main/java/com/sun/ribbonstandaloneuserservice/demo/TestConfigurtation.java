package com.sun.ribbonstandaloneuserservice.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName TestConfigurtation
 * @Description TODO
 * Author sunhong
 * Date 2020-08-07 14:50
 **/
@Configuration
public class TestConfigurtation {

    @Qualifier
    @Bean("testClass1")
    TestClass testClass1(){
        return new TestClass("Testclass1");
    }


    @Qualifier
    @Bean("testClass2")
    TestClass testClass2(){
        return new TestClass("TestClass2");
    }


    @SunHongQualifier
    @Bean("testClass3")
    TestClass testClass3(){return new TestClass("TestClass2");}

    @SunHongQualifier
    @Bean("testClass4")
    TestClass testClass4(){return new TestClass("TestClass4");}

}
