package com.youzf.myframe.bean;

import java.util.Map;

/**
 * @author hzyouzhangfeng.
 * @date 2017/3/22.
 */
public class Param {

    private Map<String, Object> paramMap;

    public Param(Map<String, Object> map) {
        this.paramMap = map;
    }

    public Map<String, Object> getMap() {
        return paramMap;
    }
}
