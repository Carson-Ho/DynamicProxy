package scut.carson_ho.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Carson_Ho on 17/7/24.
 */

 // 为了能让DynamicProxy类能够在运行时才去实现真实对象类的方法操作
 // 需要让DynamicProxy类实现JDK自带的java.lang.reflect.InvocationHandler接口
 public class DynamicProxy implements InvocationHandler {

    // 代理对象
    // 作用：绑定关系，即即关联到哪个接口（与具体的实现类绑定）的哪些方法将被调用时，执行invoke（）
    private Object ProxyObject;

    public Object newProxyInstance(Object ProxyObject){
        this.ProxyObject =ProxyObject;
        return Proxy.newProxyInstance(ProxyObject.getClass().getClassLoader(),
                ProxyObject.getClass().getInterfaces(),this);
        // 作用：根据指定的类装载器、一组接口 & 调用处理器 生成动态代理类实例，最终返回一个动态代理类实例
        // 参数说明：
        // 参数1：指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器
        // 参数2：获取目标对象的实现接口
        // 参数3：指定被拦截方法在被拦截时需要执行InvocationHandler的invoke（）的所属对象
    }

    @Override
    // InvocationHandler接口的方法
    public Object invoke(Object proxy, Method method, Object[] args)
            // 参数说明：
            // 参数1：代理
            // 参数2：目标对象被调用的方法
            // 参数3：方法的参数
            throws Throwable {
                System.out.println("代购出门了");
                Object result = null;
                // 通过Java反射机制调用目标对象方法
                result = method.invoke(ProxyObject, args);
        return result;
    }

}
