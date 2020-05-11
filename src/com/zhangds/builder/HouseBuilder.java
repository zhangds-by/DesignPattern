package com.zhangds.builder;

/**
 * Create by zhangds
 * 2020-05-11 14:16
 **/
public abstract class HouseBuilder {

    private House house = new House();

    //需要实现的建造过程
    public abstract void buildBasis();
    public abstract void buildWalls();
    public abstract void roofed();

    //返回已建好的产品（房子）返回
    public House buildHouse(){
        return house;
    }
}
