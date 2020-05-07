package com.zhangds.factory.absfactory;

import com.zhangds.factory.base.Comic;

/**
 * ��������̳��棬����ָ������ĳ����̣����ӹ�������ʵ��
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
