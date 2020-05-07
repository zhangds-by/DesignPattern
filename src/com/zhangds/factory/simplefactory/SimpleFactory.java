package com.zhangds.factory.simplefactory;

import com.zhangds.factory.base.BloodComic;
import com.zhangds.factory.base.Comic;
import com.zhangds.factory.base.FunnyComic;

/**
 * ������ͨ�������������̬�����������ʵ��
 * Create by zhangds
 * 2020-04-22 10:04
 **/
public class SimpleFactory {

    public static Comic createComic(int type){
        Comic comic = null;
        if (type == 1)
            comic = new BloodComic();
        if (type == 2)
            comic = new FunnyComic();

        return comic;
    }
}
