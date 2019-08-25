package com.gupaotask.pattern.singleton.hungry;

import java.io.Serializable;

//饿汉式  线程安全，不加锁，执行效率高，类加载时就创建，消耗资源
public class HungrySingleton implements Serializable {

    private static final HungrySingleton hungrySingleton;

    static {
        hungrySingleton=new HungrySingleton();
    }

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    public Object readResolve(){return hungrySingleton;}
}
