package com.youzf.myframe.annotation;

import java.lang.annotation.*;

/**
 * @author hzyouzhangfeng.
 * @date 2016/12/25.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Resource {

    String name() default "";
}
