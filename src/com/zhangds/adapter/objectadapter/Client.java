package com.zhangds.adapter.objectadapter;

/**
 * Create by zhangds
 * 2020-05-11 15:35
 **/
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();

        //手机使用5V的适配器转换220V电压充电
        phone.staging(new VoltageAdapter(new Voltage220V()));
    }
}
