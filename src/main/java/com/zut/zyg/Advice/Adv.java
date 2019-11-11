package com.zut.zyg.Advice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class Adv implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice  {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("调用方法之前");
    }

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("调用方法之后");
    }

    public void afterThrowing(Method method, Object[] args, Object target, Throwable exeptionClass){
        System.out.println("出错了");
    }
}
