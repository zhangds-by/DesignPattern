package com.zhangds.observer;

/**
 * Create by zhangds
 * 2020-05-09 12:02
 **/
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Baidu baidu = new Baidu();
        Google google = new Google();
        weatherData.registObserver(baidu);
        weatherData.registObserver(google);
        weatherData.setData(1.0f, 2.0f, 3.0f);
        weatherData.setData(10.0f, 20.0f, 30.0f);

    }
}
