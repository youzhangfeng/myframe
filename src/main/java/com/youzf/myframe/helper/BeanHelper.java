package com.youzf.myframe.helper;

import com.youzf.myframe.utils.ReflectionUtil;

import java.util.Map;
import java.util.Set;

import static javafx.scene.input.KeyCode.T;

/**
 * @author hzyouzhangfeng.
 * @date 2017/3/21.
 */
public final class BeanHelper {

    private static Map<Class<?>,Object> BEAN_MAP;

    static {
        Set<Class<?>> beanClassSet = ClassHelper.getBeanClassSet();
        for (Class<?> cls : beanClassSet) {
            Object instance = ReflectionUtil.newInstance(cls);
            BEAN_MAP.put(cls, instance);
        }
    }

    public static Map<Class<?>,Object> getBeanMap() {
        return BEAN_MAP;
    }

    public static <T> T  getBeanInstance(Class<T> cls) {
        if (!BEAN_MAP.containsKey(cls)) {
            throw  new RuntimeException("cannot get bean from class "+ cls);
        }
        return (T)BEAN_MAP.get(cls);
    }
}
