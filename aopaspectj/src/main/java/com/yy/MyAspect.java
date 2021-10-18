package com.yy;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspect {

    @Before(value = "execution(pubic void com.yy.SomeServiceImp.doSome(String name,Integer age))")
    public void myBefore(){
        System.out.println("前置切面功能，在目标方法之前输出执行时间："+new Date());
    }
}
