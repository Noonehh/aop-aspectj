package com.yy;

import org.aspectj.lang.annotation.Aspect;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) ctx.getBean("someService");
        proxy.doSome("lisi",20);
    }
}
