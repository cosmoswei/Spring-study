package com.wei.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author 21170
 */
@Aspect//标注为一个切面
public class AnnotationPointCut {

    @Before("execution(* com.wei.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("【三】===方法执行前===");
    }

    @After("execution(* com.wei.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("===方法执行后===");
    }

    @Around("execution(* com.wei.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        //执行环绕
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕后");
        System.out.println(proceedingJoinPoint.getSignature());
        System.out.println(proceed);
    }
}
