package com.zhangds.decorator;

public abstract class Vedio {
	
	private String category;
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	abstract String belongto();

}
