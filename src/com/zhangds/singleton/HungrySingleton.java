package com.zhangds.singleton;

/**
 * ����ʽ
 * @author zhangds
 *
 */
public class HungrySingleton {
	//˽�л�������
    private HungrySingleton(){

    }
    //�ڲ���������ʵ��
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();
    //�ṩ���о�̬��������ʵ��
    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }
}
