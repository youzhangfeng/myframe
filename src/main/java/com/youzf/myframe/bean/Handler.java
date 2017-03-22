package com.youzf.myframe.bean;

import com.youzf.myframe.annotation.Controller;

import java.lang.reflect.Method;

/**
 * @author hzyouzhangfeng.
 * @date 2017/3/22.
 */
public class Handler {

    private Class<?> controllerClass;

    private Method method;

    public Handler(Class<?> controllerClass, Method method) {
        this.controllerClass =controllerClass;
        this.method = method;
    }

    public Class<? > getControllerClass() {
        return controllerClass;
    }

    public void setControllerClass(Class<?> controllerClass) {
        this.controllerClass = controllerClass;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }
}
