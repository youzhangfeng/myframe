package com.youzf.myframe.utils;

import java.util.Collection;
import java.util.Map;

/**
 * @author hzyouzhangfeng.
 * @date 2017/3/22.
 */
public class CollectionUtil  {

    public static  boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.size() == 0;
    }

    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }


    public static boolean isEmpty(Map<?,?> map) {
        return map == null || map.size() == 0;
    }

    public static boolean isNotEmpty(Map<?,?> map) {
        return !isEmpty(map);
    }

    public static boolean isEmpty(Object[] objects) {
        return objects == null || objects.length == 0;
    }

    public static boolean isNotEmpty(Object[] objects) {
        return !isEmpty(objects);
    }


}
