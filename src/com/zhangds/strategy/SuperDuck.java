package com.zhangds.strategy;

/**
 * Create by zhangds
 * 2020-05-09 10:50
 **/
public class SuperDuck extends Duck{

    //默认超鸭不会飞也不会叫
    public SuperDuck() {
        flyBehavior = new CanFly();
        quackBehavior = new CanQuack();
    }

    @Override
    void display() {
        System.out.println("超鸭");
    }
}
