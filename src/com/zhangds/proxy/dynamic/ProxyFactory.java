package com.zhangds.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用反射机制调用目标对象方法
 * Create by zhangds
 * 2020-05-09 09:32
 **/
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * ClassLoader loader : 目标对象的类加载器
     * Class<?>[] interfaces : 目标对象实现的接口类型（使用泛型）
     * InvocationHandler h : 执行目标对象方法时触发的事件处理器，目标对象方法作为参数
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理增强");
                        Object returnVal = method.invoke(target, args);
                        return returnVal;
                    }
                });
    }
}
