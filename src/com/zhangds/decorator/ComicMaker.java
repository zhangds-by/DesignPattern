package com.zhangds.decorator;

public class ComicMaker {
	
	public static void main(String[] args) {
		//дһ�������������Ц���
		Vedio vedio = new ChinaComic();
		vedio = new Funny(vedio);
		vedio = new Blood(vedio);
		
		System.out.println(vedio.getCategory());
	}
}
