package com.zhangds.observer;

/**
 * Create by zhangds
 * 2020-05-09 11:46
 **/
public interface Subject {

    void registObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
