package com.zhangds.adapter.classadapter;

/**
 * Create by zhangds
 * 2020-05-11 15:35
 **/
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();

        //手机使用5V的适配器充电
        phone.staging(new VoltageAdapter());
    }
}
