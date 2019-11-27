package com.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 真正生成代理类的地方
 * sun.misc.ProxyGenerator#generateProxyClass(java.lang.String, java.lang.Class[], int)
 * 配置如下参数可以让 JVM 将生成的类文件保存到文件系统
 * sun.misc.ProxyGenerator.saveGeneratedFiles
 */
public class DynamicProxyTest {

    interface SayHello{
        void hello();
    }

    static class Duck implements SayHello{

        @Override
        public void hello() {
            System.out.println("嘎嘎");
        }
    }

    static class Handler implements InvocationHandler {
        SayHello sayHello;
        Handler(SayHello sayHello){
            this.sayHello = sayHello;
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("hello");
            method.invoke(sayHello, args);
            return null;
        }
    }

    public static void main(String[] args) {

        SayHello sayHello = (SayHello) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                new Class[]{SayHello.class},
                new Handler(new Duck()));

        sayHello.hello();
    }
}
