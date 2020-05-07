package com.zhangds.factory.absfactory.base;

import com.zhangds.factory.base.Comic;

/**
 * Create by zhangds
 * 2020-04-22 10:05
 **/
public class ChinaBloodComic extends Comic {
	
	private final String LOGO = "Made in China";

    @Override
    public void desc() {
        System.out.println(LOGO + "ÈÈÑªÂþ»­");
    }

    public ChinaBloodComic() {
    }

    public ChinaBloodComic(String production) {
        this.production = production;
    }
}
