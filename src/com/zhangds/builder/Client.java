package com.zhangds.builder;

/**
 * Create by zhangds
 * 2020-05-11 14:26
 **/
public class Client {

    public static void main(String[] args) {
        //建造普通的房子，交给指挥师建造
        CommonHouse commonHouse = new CommonHouse();

        HouseDiretor diretor = new HouseDiretor(commonHouse);

        //返回建造完成的房子
        diretor.constructHouse();

        //建高楼
        HighHouse highHouse = new HighHouse();
        diretor.setHouseBuilder(highHouse);
        diretor.constructHouse();

        //StringBuilder为指挥者和具体建造者、AbstractStringBuilder实现了建造方法、Appendable为抽象建造者
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");
    }

}
