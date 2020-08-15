package com.sun.ribbonstandaloneuserservice.demo;

import java.lang.annotation.*;

/**
 * @ClassName SunHongQualifier
 * @Description TODO
 * Author sunhong
 * Date 2020-08-09 15:38
 **/
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface SunHongQualifier {
}
