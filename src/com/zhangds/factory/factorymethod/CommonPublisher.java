package com.zhangds.factory.factorymethod;

import com.zhangds.factory.base.Comic;

/**
 * �ó��󹤳��ӿڲ��ٸ�����Ĵ��������������ʵ�����������
 * Create by zhangds
 * 2020-04-22 10:43
 **/
public abstract class CommonPublisher {
	
	public abstract Comic createComic(int type);
	
	
}
