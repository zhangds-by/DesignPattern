package com.zhangds.strategy;

/**
 * Create by zhangds
 * 2020-05-09 10:35
 **/
public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("走地鸭");
    }
}
