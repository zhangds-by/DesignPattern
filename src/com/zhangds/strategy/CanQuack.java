package com.zhangds.strategy;

/**
 * Create by zhangds
 * 2020-05-09 10:39
 **/
public class CanQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("咆哮鸭");
    }
}
