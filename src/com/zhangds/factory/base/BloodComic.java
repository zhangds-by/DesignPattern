package com.zhangds.factory.base;

/**
 * Create by zhangds
 * 2020-04-22 10:05
 **/
public class BloodComic extends Comic {

    @Override
    public void desc() {
        System.out.println(this.production + "��Ѫ����");
    }

    public BloodComic() {
    }

    public BloodComic(String production) {
        this.production = production;
    }
}
