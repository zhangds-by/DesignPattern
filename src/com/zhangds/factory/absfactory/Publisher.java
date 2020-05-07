package com.zhangds.factory.absfactory;

import com.zhangds.factory.base.Comic;

/**
 * 多个出版商出版，无需指明具体的出版商，由子工厂创建实例
 * @author zhangds
 *
 */
public class Publisher {
	
	AbsFactory absFactory;
	
	public AbsFactory setFactory(AbsFactory absFactory){
		this.absFactory = absFactory;
		return this.absFactory;
	}
	
	public Comic createComic(int type) {
		Comic comic = absFactory.createComic(type);
        return comic;
	}

}
