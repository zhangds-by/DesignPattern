package com.zhangds.strategy;

/**
 * Create by zhangds
 * 2020-05-09 10:37
 **/
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    abstract void display();

    public void fly(){
        if (flyBehavior != null){
            flyBehavior.fly();
        }
    }

    public void quack(){
        if (quackBehavior != null){
            quackBehavior.quack();
        }
    }
}
