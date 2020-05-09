package com.zhangds.observer;

/**
 * Create by zhangds
 * 2020-05-09 11:52
 **/
public class Baidu implements Observer{

    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = temperature;
        display();
    }

    public void display(){
        System.out.println("百度天气预报");
        System.out.println("温度:" + this.temperature);
        System.out.println("气压:" + this.pressure);
        System.out.println("湿度:" + this.temperature);
    }
}
