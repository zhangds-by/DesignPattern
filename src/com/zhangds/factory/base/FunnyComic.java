package com.zhangds.factory.base;

/**
 * Create by zhangds
 * 2020-04-22 10:11
 **/
public class FunnyComic extends Comic {

    @Override
    public void desc() {
        System.out.println(this.production + "¸ãÐ¦Âþ»­");
    }

    public FunnyComic(){
    	
    }

	public FunnyComic(String production) {
		this.production = production;
	}


}
