package com.wei.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnvValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("【后一】执行了"+method.getName()+"方法，返回结果为："+returnvValue);
    }
}
