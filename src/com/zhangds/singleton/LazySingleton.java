package com.zhangds.singleton;

/**
 * Create by zhangds
 * 2020-05-07 15:43
 **/
public class LazySingleton {
    private LazySingleton(){}

    private static LazySingleton instance;

    public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
