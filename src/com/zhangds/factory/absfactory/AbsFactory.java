package com.zhangds.factory.absfactory;

import com.zhangds.factory.base.Comic;

public interface AbsFactory {
	
	public Comic createComic(int type);
}
