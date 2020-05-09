package com.zhangds.strategy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Create by zhangds
 * 2020-05-09 10:51
 **/
public class Client {

    public static void main(String[] args) {
        SuperDuck superDuck = new SuperDuck();
        superDuck.display();
        superDuck.fly();

        //修改超鸭的飞行能力(替换不同的算法策略来修改目标对象的行为)
        System.out.println("=============修改超鸭的飞行能力后==============");
        superDuck.setFlyBehavior(new NoFly());
        superDuck.fly();
        superDuck.setQuackBehavior(new NoQuack());
        superDuck.quack();

        Integer[] arr = {3,4,6,1,2};
        //相当于实现Comparator，重写算法，用于传入策略实现
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2){
                    return -1;
                }else {
                    return 1;
                }
            }
        };
        //替换不同的Comparator算法实现排序
        Arrays.sort(arr, comparator);
        System.out.println(Arrays.toString(arr));
    }
}
