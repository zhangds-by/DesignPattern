package com.zhangds.decorator;

public class ComicMaker {
	
	public static void main(String[] args) {
		//写一本国漫，加入搞笑风格
		Vedio vedio = new ChinaComic();
		vedio = new Funny(vedio);
		vedio = new Blood(vedio);
		
		System.out.println(vedio.getCategory());
	}
}
