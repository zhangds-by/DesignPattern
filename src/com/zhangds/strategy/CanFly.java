package com.zhangds.strategy;

/**
 * Create by zhangds
 * 2020-05-09 10:34
 **/
public class CanFly implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("上天鸭");
    }
}
