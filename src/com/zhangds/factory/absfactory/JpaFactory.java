package com.zhangds.factory.absfactory;

import com.zhangds.factory.absfactory.base.JpaBloodComic;
import com.zhangds.factory.absfactory.base.JpaFunnyComic;
import com.zhangds.factory.base.Comic;

public class JpaFactory implements AbsFactory{
	
	@Override
	public Comic createComic(int type) {
		Comic comic = null;
        if (type == 1)
            comic = new JpaBloodComic();
        if (type == 2)
            comic = new JpaFunnyComic();

        return comic;
	}

}
