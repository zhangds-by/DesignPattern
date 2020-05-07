package com.zhangds.singleton;

/**
 * Create by zhangds
 * 2020-05-07 15:43
 **/
public class EnumSingleton {
    public static void main(String[] args) {
        SingletonEnum singleton =SingletonEnum.INSTANCE;
        SingletonEnum singleton1 =SingletonEnum.INSTANCE;
        System.out.println(singleton == singleton1);
    }
}

enum SingletonEnum{
    INSTANCE;
}
