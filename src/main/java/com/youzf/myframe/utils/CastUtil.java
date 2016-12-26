package com.youzf.myframe.utils;

/**
 * @author hzyouzhangfeng.
 * @date 2016/12/25.
 */
public final class CastUtil {

    /**
     * 转换字符串，默认为 ""
     * @param object
     * @return
     */
    public static String castString(Object object){
        return castString(object,"");
    }

    /**
     * 转为字符串，提供默认值
     * @param object
     * @param defaultValue
     * @return
     */
    public static String castString(Object object, String defaultValue) {
        return object == null ? defaultValue : String.valueOf(object);
    }


    /**
     * 转为double值，默认为0
     * @param object
     * @return
     */
    public static double castDouble(Object object){
        return castDouble(object,0);
    }

    /**
     * 转为double值，提供默认值
     * @param object
     * @param defaultValue
     * @return
     */
    public static double castDouble(Object object, double defaultValue) {
        double doubleValue = defaultValue;
        if (object != null) {
            String value = castString(object);
            if (StringUtils.isNotEmpty(value)) {
                try {
                    doubleValue = Double.parseDouble(value);
                } catch (NumberFormatException nfe) {
                    doubleValue = defaultValue;
                }
            }
        }
        return doubleValue;
    }

    /**
     * 转为long值，默认为0
     * @param object
     * @return
     */
    public static long castLong(Object object){
        return castLong(object,0);
    }

    /**
     * 转为long值，提供默认值
     * @param object
     * @param defalutValue
     * @return
     */
    public static long castLong(Object object,long defalutValue){
        long longValue = defalutValue;
        if(object!=null){
            String strValue = castString(object);
            if(StringUtils.isNotEmpty(strValue)){
                try {
                    longValue = Long.parseLong(strValue);
                }catch (NumberFormatException nfe){
                    longValue = defalutValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 转为int值，默认为0
     * @param object
     * @return
     */
    public static int castInt(Object object){
        return castInt(object,0);
    }

    /**
     * 转为int值，提供默认值
     * @param object
     * @param defalutValue
     * @return
     */
    public static int castInt(Object object , int defalutValue){
        int intValue = defalutValue;
        if(object != null){
            String strValue = castString(object);
            if(StringUtils.isNotEmpty(strValue)){
                try {
                    intValue = Integer.parseInt(strValue);
                }catch (NumberFormatException nfe){
                    intValue = defalutValue;
                }
            }
        }
        return intValue;
    }

    /**
     * 转为boolean值，默认为false
     * @param object
     * @return
     */
    public static boolean castBoolean(Object object){
        return castBoolean(object,false);
    }

    /**
     * 转为boolean值，提供默认值
     * @param object
     * @param defaultValue
     * @return
     */
    public static boolean castBoolean(Object object ,boolean defaultValue){
        boolean booleanValue = defaultValue;
        if(object != null) {
            booleanValue = Boolean.parseBoolean(castString(object));
        }
        return booleanValue;
    }

}
