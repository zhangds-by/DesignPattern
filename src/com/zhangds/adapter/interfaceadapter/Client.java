package com.zhangds.adapter.interfaceadapter;

import java.util.Arrays;

/**
 * Create by zhangds
 * 2020-05-11 16:06
 **/
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void optionA() {
                System.out.println("只需要重写A方法");
            }
        };

        absAdapter.optionA();

        Arrays.asList(new int[]{1,2,3});
    }
}
