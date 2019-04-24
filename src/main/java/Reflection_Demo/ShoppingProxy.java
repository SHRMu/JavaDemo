package Reflection_Demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


//用于动态生成代理对象
public class ShoppingProxy implements InvocationHandler {
    private Object target; //代理的目标对象

    //用于创建代理对象方法
    public Object createTarget(Object target){
        Object o = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        return o;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
