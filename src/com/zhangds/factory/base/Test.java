package com.zhangds.factory.base;

import com.zhangds.factory.absfactory.ChinaFactory;
import com.zhangds.factory.absfactory.Publisher;
import com.zhangds.factory.factorymethod.ChinaPublisher;
import com.zhangds.factory.factorymethod.JpaPublisher;

/**
 * Create by zhangds
 * 2020-04-22 10:16
 **/
public class Test {

    public static void main(String[] args) {
        //简单工厂模式：通过工厂出版不同类型漫画(解决出版不同类型漫画的需求)
//        SimpleFactory simpleFactory = new SimpleFactory();
//        Comic comic = simpleFactory.createComic(1);
//        comic.desc();

        //通过不同出版社出版不同类型漫画（解决多个出版商出版问题）
//    	new ChinaPublisher().createComic(1).desc();
//    	new JpaPublisher().createComic(2).desc();

    	//某出版社想出版中国热血漫
    	new Publisher().setFactory(new ChinaFactory()).createComic(1).desc();
    }
}
