package com.roke.cn.target;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.PARAMETER, ElementType.METHOD})    
@Retention(RetentionPolicy.RUNTIME)    
@Documented 
public @interface BizControllerLog {
    public String name() default "";
    public String description() default "";
    public String oprKey()default "token";
    //biz模块key
    public String bizDefault() default "";
    public String flagKey() default "";
    public String bizKey() default "";
}
