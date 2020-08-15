package com.sun.ribbonstandaloneuserservice.demo;

/**
 * @ClassName TestClass
 * @Description TODO
 * Author sunhong
 * Date 2020-08-07 14:49
 **/
public class TestClass {


    private String name;

    public TestClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
