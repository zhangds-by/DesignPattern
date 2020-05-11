package com.zhangds.adapter.classadapter;

/**
 * Create by zhangds
 * 2020-05-11 15:31
 **/
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int srcV = output220V();
        System.out.println("源电压" + srcV);
        int destV = srcV/44;
        return destV;
    }
}
