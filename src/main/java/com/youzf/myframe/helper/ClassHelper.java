package com.youzf.myframe.helper;

import com.youzf.myframe.annotation.Controller;
import com.youzf.myframe.annotation.Service;
import com.youzf.myframe.utils.ClassUtil;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hzyouzhangfeng.
 * @date 2017/3/21.
 */
public final class ClassHelper {

    private static final Set<Class<?>> CLASS_SET;

    static {
        String basePackage = ConfigHelper.getAppBasePackage();
        CLASS_SET = ClassUtil.getClassSet(basePackage);
    }

    /**
     * 获取所有的类
     * @return
     */
    public static Set<Class<?>> getClassSet() {
        return CLASS_SET;
    }


    /**
     * 获取所有Service注解的类
     */
    public static Set<Class<?>> getServiceClassSet() {
        Set<Class<?>> serviceClassSet = new HashSet<>();
        for (Class<?> cls : CLASS_SET) {
            if (cls.isAnnotationPresent(Service.class)) {
                serviceClassSet.add(cls);
            }
        }
        return serviceClassSet;
    }

    /**
     * 获取所有的controller注解的类
     * @return
     */
    public static Set<Class<?>> getControllerClassSet() {
        Set<Class<?>> controllerClassSet = new HashSet<>();
        for (Class<?> cls : CLASS_SET) {
            if (cls.isAnnotationPresent(Controller.class)) {
                controllerClassSet.add(cls);
            }
        }
        return controllerClassSet;
    }

    public static Set<Class<?>> getBeanClassSet() {
        Set<Class<?>> beanClassSet = new HashSet<>();
        Set<Class<?>> serviceClassSet = getServiceClassSet();
        Set<Class<?>> controllerClassSet = getControllerClassSet();
        beanClassSet.addAll(serviceClassSet);
        beanClassSet.addAll(controllerClassSet);
        return beanClassSet;
    }

}
