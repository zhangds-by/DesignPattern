package com.zhangds.decorator;

public class Comic extends Vedio {

	@Override
	public String belongto() {
		return super.getCategory();
	}

}
