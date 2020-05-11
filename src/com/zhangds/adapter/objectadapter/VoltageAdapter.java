package com.zhangds.adapter.objectadapter;

/**
 *
 * Create by zhangds
 * 2020-05-11 15:31
 **/
public class VoltageAdapter implements IVoltage5V {

    //合成复用原则，关联代替继承
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int destV = 0;
        if (null!=voltage220V){
            int srcV = voltage220V.output220V();
            System.out.println("源电压" + srcV);
            destV = srcV/44;
        }
        return destV;
    }
}
