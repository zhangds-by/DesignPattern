package com.zhangds.builder;

/**
 * Create by zhangds
 * 2020-05-11 14:24
 **/
public class HighHouse extends HouseBuilder{
    @Override
    public void buildBasis() {
        System.out.println("高楼建基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");

    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");

    }
}
