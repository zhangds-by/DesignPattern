package com.zhangds.proxy.cglib;

import com.zhangds.proxy.dynamic.ITeacherDao;

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
