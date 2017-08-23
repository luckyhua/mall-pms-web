package com.liegou.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 * 
 * @author luckyhua
 * @since 2017/08/23
 * @version 1.0.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

	String value() default "";
}
