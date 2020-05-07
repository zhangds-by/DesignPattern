package com.zhangds.singleton;

/**
 * 饿汉式 -- 静态代码块
 * @author zhangds
 *
 */
public class HungrySingletonStatic {
	//私有化构造器
    private HungrySingletonStatic(){

    }
    //内部创建对象实例
    private static HungrySingletonStatic instance ;
    static {
        instance = new HungrySingletonStatic();
    }
    //提供公有静态方法返回实例
    public static HungrySingletonStatic getInstance(){
        return instance;
    }
}
