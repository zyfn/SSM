package com.zut.zyg.Advice;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AspectJtest {
    @Before(("execution(* com.zut.zyg.ServiceImpl.*.*(..))"))
    public void before(){
        System.out.println("before");
    }
    @After(("execution(* com.zut.zyg.ServiceImpl.*.*(..))"))
    public void after(){
        System.out.println("after");
    }
    @AfterReturning(("execution(* com.zut.zyg.ServiceImpl.*.*(..))"))
    public void afterReturning(){
        System.out.println("afterReturning");
    }
    @AfterThrowing(("execution(* com.zut.zyg.ServiceImpl.*.*(..))"))
    public void afterThrowing(){
        System.out.println("afterThrowing");

    }
}
