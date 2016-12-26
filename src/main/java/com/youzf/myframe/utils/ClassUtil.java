package com.youzf.myframe.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hzyouzhangfeng.
 * @date 2016/12/25.
 */
public final class ClassUtil {

    private static final Logger logger = LoggerFactory.getLogger(ClassUtil.class);

    /**
     * 获取类加载器
     * @return
     */
    public static ClassLoader getClassLoader(){
        return Thread.currentThread().getContextClassLoader();
    }

    public static Class<?> loadClass(String name ,boolean isInitialized) {
        Class<?> clazz ;
        try{
            clazz = Class.forName(name,isInitialized,getClassLoader());
        }catch (ClassNotFoundException e){
            logger.error("load class faliure",e);
            throw new RuntimeException(e);
        }
        return clazz;
    }
}
