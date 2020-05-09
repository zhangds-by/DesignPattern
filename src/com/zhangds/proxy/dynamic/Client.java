package com.zhangds.proxy.dynamic;

import com.zhangds.proxy.staticproxy.TeacherDaoProxy;

/**
 * Create by zhangds
 * 2020-05-09 09:01
 **/
public class Client {
    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach();
    }
}
