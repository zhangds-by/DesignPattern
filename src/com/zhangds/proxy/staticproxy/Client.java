package com.zhangds.proxy.staticproxy;

import com.zhangds.proxy.dynamic.ProxyFactory;

/**
 * Create by zhangds
 * 2020-05-09 09:01
 **/
public class Client {
    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();
        TeacherDaoProxy proxy = new TeacherDaoProxy(target);
        proxy.teach();
    }
}
