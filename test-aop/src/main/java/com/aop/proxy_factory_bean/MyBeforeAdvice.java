package com.aop.proxy_factory_bean;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyBeforeAdvice implements MethodBeforeAdvice {



    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {


        System.out.println("before advice");
    }
}
