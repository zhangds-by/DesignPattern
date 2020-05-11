package com.zhangds.builder;

/**
 * Create by zhangds
 * 2020-05-11 14:26
 **/
public class HouseDiretor {

    private HouseBuilder houseBuilder;

    public HouseDiretor(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //指定建造房子的过程，并返回对应的产品
    //隔离产品和建造过程，控制生产过程
    public House constructHouse(){
        houseBuilder.buildBasis();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
