package com.zhangds.factory.absfactory.base;

import com.zhangds.factory.base.Comic;

/**
 * Create by zhangds
 * 2020-04-22 10:11
 **/
public class JpaFunnyComic extends Comic {
	
	private final String LOGO = "Made in jpa";

    @Override
    public void desc() {
        System.out.println(LOGO + "¸ãÐ¦Âþ»­");
    }

    public JpaFunnyComic(){
    	
    }

	public JpaFunnyComic(String production) {
		this.production = production;
	}


}
