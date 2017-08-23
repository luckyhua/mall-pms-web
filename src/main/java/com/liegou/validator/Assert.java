package com.liegou.validator;

import com.liegou.exception.RRException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 * @author luckyhua
 * @since 2017/08/23
 * @version 1.0.0
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new RRException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new RRException(message);
        }
    }
}
