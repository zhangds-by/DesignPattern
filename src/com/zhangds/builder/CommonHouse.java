package com.zhangds.builder;

/**
 * Create by zhangds
 * 2020-05-11 14:21
 **/
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasis() {
        System.out.println("普通房子建基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");

    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");

    }
}
