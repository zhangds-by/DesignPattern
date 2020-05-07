package com.zhangds.singleton;

/**
 * Create by zhangds
 * 2020-05-07 15:43
 **/
public class DoubleCheckSingleton {
    private DoubleCheckSingleton(){}

    private static DoubleCheckSingleton instance;

    public static synchronized DoubleCheckSingleton getInstance(){
        if (instance == null){
            synchronized (DoubleCheckSingleton.class){
                if (instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}
