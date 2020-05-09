package com.zhangds.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用反射机制调用目标对象方法
 * Create by zhangds
 * 2020-05-09 09:32
 **/
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     */
    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass()); //设置目标对象为父类
        enhancer.setCallback(this); //设置回调函数
        return enhancer.create(); //创建子类代理对象
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("增强代码");
        Object returnVal = method.invoke(obj, args);
        return returnVal;
    }
}
