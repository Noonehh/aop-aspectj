package com.yy;


//目标类
public class SomeServiceImpl implements SomeService {

    @Override
    public void doSome(String name, Integer age) {
        System.out.println("======目标方法doSome()======");

    }
}
