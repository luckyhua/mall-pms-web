package com.liegou.modules.api.annotation;

import java.lang.annotation.*;

/**
 * api接口，忽略Token验证
 * @author luckyhua
 * @since 2017/08/23
 * @version 1.0.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthIgnore {

}
