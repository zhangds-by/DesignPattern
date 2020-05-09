package com.zhangds.proxy.staticproxy;

/**
 * Create by zhangds
 * 2020-05-09 09:00
 **/
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("教师授课");
    }
}
