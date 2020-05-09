package com.zhangds.strategy;

/**
 * Create by zhangds
 * 2020-05-09 10:38
 **/
public class NoQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("哑巴鸭");
    }
}
