package com.zhangds.singleton;

/**
 * 饿汉式
 * @author zhangds
 *
 */
public class HungrySingleton {
	//私有化构造器
    private HungrySingleton(){

    }
    //内部创建对象实例
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();
    //提供公有静态方法返回实例
    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }
}
