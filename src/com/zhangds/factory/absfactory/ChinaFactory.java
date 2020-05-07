package com.zhangds.factory.absfactory;

import com.zhangds.factory.absfactory.base.ChinaBloodComic;
import com.zhangds.factory.absfactory.base.ChinaFunnyComic;
import com.zhangds.factory.base.Comic;

public class ChinaFactory implements AbsFactory {

	@Override
	public Comic createComic(int type) {
		Comic comic = null;
        if (type == 1)
            comic = new ChinaBloodComic();
        if (type == 2)
            comic = new ChinaFunnyComic();

        return comic;
	}

}
