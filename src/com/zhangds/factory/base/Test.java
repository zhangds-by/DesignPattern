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
        //�򵥹���ģʽ��ͨ���������治ͬ��������(������治ͬ��������������)
//        SimpleFactory simpleFactory = new SimpleFactory();
//        Comic comic = simpleFactory.createComic(1);
//        comic.desc();

        //ͨ����ͬ��������治ͬ���������������������̳������⣩
//    	new ChinaPublisher().createComic(1).desc();
//    	new JpaPublisher().createComic(2).desc();

    	//ĳ������������й���Ѫ��
    	new Publisher().setFactory(new ChinaFactory()).createComic(1).desc();
    }
}
