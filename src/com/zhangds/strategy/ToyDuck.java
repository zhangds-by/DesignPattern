package com.zhangds.strategy;

/**
 * Create by zhangds
 * 2020-05-09 10:44
 **/
public class ToyDuck extends Duck {

    //默认玩具鸭不会飞也不会叫
    public ToyDuck() {
        flyBehavior = new CanFly();
        quackBehavior = new CanQuack();
    }

    @Override
    void display() {
        System.out.println("玩具鸭");
    }
}
