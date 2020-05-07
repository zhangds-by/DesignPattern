package com.zhangds.factory.factorymethod;

import com.zhangds.factory.base.Comic;

/**
 * 该抽象工厂接口不再负责类的创建，由子类决定实例化具体的类
 * Create by zhangds
 * 2020-04-22 10:43
 **/
public abstract class CommonPublisher {
	
	public abstract Comic createComic(int type);
	
	
}
