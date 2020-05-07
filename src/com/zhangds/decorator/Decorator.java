package com.zhangds.decorator;

public class Decorator extends Vedio{
	private Vedio vedio;
	
	public Decorator (Vedio vedio){
		this.vedio = vedio;
	}

	@Override
	String belongto() {
		return super.getCategory() + vedio.getCategory();
	}
	
	@Override
	public String getCategory() {
		return super.getCategory() + vedio.getCategory();
	}
}
