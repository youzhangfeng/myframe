package com.youzf.myframe.helper;

import com.youzf.myframe.annotation.Resource;
import com.youzf.myframe.utils.CollectionUtil;
import com.youzf.myframe.utils.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @author hzyouzhangfeng.
 * @date 2017/3/21.
 */
public final class IocHelper {

    static {
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtil.isNotEmpty(beanMap)) {
            for (Map.Entry<Class<?>, Object> bean : beanMap.entrySet()) {
                Class<?> beanClass = bean.getKey();
                Object beanInstance = bean.getValue();
                Field[] fields = beanClass.getFields();
                if (CollectionUtil.isEmpty(fields)) {
                    continue;
                }
                for (Field field : fields) {
                    if (!field.isAnnotationPresent(Resource.class)) {
                        continue;
                    }
                    Class<?> fieldClass = field.getClass();
                    Object fieldInstance = beanMap.get(fieldClass);
                    if (fieldInstance != null) {
                        ReflectionUtil.setField(beanInstance, field, fieldInstance);
                    }
                }
            }
        }
    }
}
