package com.youzf.myframe;

import com.youzf.myframe.helper.BeanHelper;
import com.youzf.myframe.helper.ClassHelper;
import com.youzf.myframe.helper.ControllerHelper;
import com.youzf.myframe.helper.IocHelper;
import com.youzf.myframe.utils.ClassUtil;

/**
 * @author hzyouzhangfeng.
 * @date 2017/3/22.
 */
public final class HelperLoader {

    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName(), false);
        }
    }
}
