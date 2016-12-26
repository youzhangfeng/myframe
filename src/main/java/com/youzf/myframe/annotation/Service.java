package com.youzf.myframe.annotation;

import java.lang.annotation.*;

/**
 * @author hzyouzhangfeng.
 * @date 2016/12/25.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Service {

    String value() default "";
}
