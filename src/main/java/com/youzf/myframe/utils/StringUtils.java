package com.youzf.myframe.utils;

/**
 * 字符串工具类
 * @author hzyouzhangfeng.
 * @date 2016/12/25.
 */
public final class StringUtils {

    /**
     * 判断字符串是否为空
     * @param value
     * @return
     */
    public static boolean isEmpty(String value) {
        return value == null ? true : value.equals("") ? true : false;
    }

    /**
     * 判断字符串是否非空
     * @param value
     * @return
     */
    public static boolean isNotEmpty(String value){
        return !isEmpty(value);
    }
}
