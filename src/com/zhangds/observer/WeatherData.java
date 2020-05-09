package com.zhangds.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by zhangds
 * 2020-05-09 11:49
 **/
public class WeatherData implements Subject {

    private float temperatrue;
    private float pressure;
    private float humidity;

    List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
        }
    }

    public void setData(float temperatrue, float pressure, float humidity){
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    public void dataChange(){
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(this.temperatrue, this.pressure, this.humidity);
        }
    }
}
