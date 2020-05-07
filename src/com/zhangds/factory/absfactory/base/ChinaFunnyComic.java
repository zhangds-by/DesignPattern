package com.zhangds.factory.absfactory.base;

import com.zhangds.factory.base.Comic;

/**
 * Create by zhangds
 * 2020-04-22 10:11
 **/
public class ChinaFunnyComic extends Comic {
	
	private final String LOGO = "Made in China";

    @Override
    public void desc() {
        System.out.println(LOGO + "¸ãÐ¦Âþ»­");
    }

    public ChinaFunnyComic(){
    	
    }

	public ChinaFunnyComic(String production) {
		this.production = production;
	}


}
