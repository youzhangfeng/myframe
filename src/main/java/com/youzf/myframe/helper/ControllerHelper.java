package com.youzf.myframe.helper;

import com.youzf.myframe.annotation.Controller;
import com.youzf.myframe.annotation.RequestMapping;
import com.youzf.myframe.bean.Handler;
import com.youzf.myframe.utils.CollectionUtil;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author hzyouzhangfeng.
 * @date 2017/3/22.
 */
public final class ControllerHelper {

    private static Map<String, Handler>  REQUEST_MAP = new HashMap<>();

    static {
        Set<Class<?>> controllerClassSet = ClassHelper.getControllerClassSet();
        if (CollectionUtil.isNotEmpty(controllerClassSet)) {
            for (Class<?> controllerClass : controllerClassSet) {
                Method[] methods = controllerClass.getMethods();
                if (CollectionUtil.isEmpty(methods)) {
                    continue;
                }
                for (Method method : methods) {
                    if(!method.isAnnotationPresent(RequestMapping.class)) {
                    }
                    RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
                    String requestPath = requestMapping.value();
                    REQUEST_MAP.put(requestPath, new Handler(controllerClass, method));
                }
            }
        }
    }

    public static Handler getHandler(String reqeustPath) {
        return REQUEST_MAP.get(reqeustPath);
    }
}
