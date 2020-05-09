package com.zhangds.observer;

/**
 * Create by zhangds
 * 2020-05-09 11:47
 **/
public interface Observer {

    void update(float temperature, float pressure, float humidity);
}
