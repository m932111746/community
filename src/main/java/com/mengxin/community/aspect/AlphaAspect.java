package com.mengxin.community.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author mx
 * @date 2020/4/28 - 13:07
 */
//@Component
//@Aspect
public class AlphaAspect {

    // 第一个*表示返回值
    // .. 所有参数
    @Pointcut("execution(* com.mengxin.community.service.*.*(..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void before() {
        System.out.println("before");
    }

    @After("pointcut()")
    public void after() {
        System.out.println("after");
    }

    @AfterReturning("pointcut()")
    public void afterReturning() {
        System.out.println("afterReturning");
    }

    @AfterThrowing("pointcut()")
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around_before");
        Object obj = joinPoint.proceed();
        System.out.println("around_after");
        return obj;
    }
}
