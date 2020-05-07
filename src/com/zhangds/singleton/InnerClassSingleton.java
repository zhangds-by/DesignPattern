package com.zhangds.singleton;

/**
 * Create by zhangds
 * 2020-05-07 15:43
 **/
public class InnerClassSingleton {
    private InnerClassSingleton(){}



    public static class SingletonInstance{
        private static InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static synchronized InnerClassSingleton getInstance(){
        return InnerClassSingleton.getInstance();
    }

}
