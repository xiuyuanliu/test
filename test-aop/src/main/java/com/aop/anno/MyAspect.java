package com.aop.anno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {



    @Pointcut(value = "execution(* com.aop.MyService.*(..))")
    public void beforePointcut() {}


    @Before(value = "beforePointcut()")
    public void before() {

        System.out.println("before do something ...");
    }
}
