package com.zhangds.proxy.staticproxy;

/**
 * 代理对象和目标对象都要实现相同的接口
 * Create by zhangds
 * 2020-05-09 09:01
 **/
public class TeacherDaoProxy implements ITeacherDao {

    ITeacherDao target;

    public TeacherDaoProxy() {
    }

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("增强代码");
        target.teach();
    }
}
