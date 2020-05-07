package com.zhangds.factory.factorymethod;

import com.zhangds.factory.base.BloodComic;
import com.zhangds.factory.base.Comic;
import com.zhangds.factory.base.FunnyComic;

/**
 * Create by zhangds
 * 2020-04-22 10:23
 **/
public class JpaPublisher extends CommonPublisher {
	
	private final String LOGO = "Made in Jpa";

	public  Comic createComic(int type){
        Comic comic = null;
        if (type == 1)
            comic = new BloodComic(LOGO);
        if (type == 2)
            comic = new FunnyComic(LOGO);

        return comic;
    }
}
