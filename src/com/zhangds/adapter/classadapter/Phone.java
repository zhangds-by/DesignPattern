package com.zhangds.adapter.classadapter;

/**
 * Create by zhangds
 * 2020-05-11 15:33
 **/
public class Phone {

    public void staging(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V() == 5){
            System.out.println("使用适配器的电压"  + iVoltage5V.output5V() + "可以充电");
        }else {
            System.out.println("使用适配器的电压"  + iVoltage5V.output5V() + "不可以充电，会炸");
        }
    }
}
