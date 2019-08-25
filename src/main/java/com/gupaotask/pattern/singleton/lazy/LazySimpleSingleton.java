package com.gupaotask.pattern.singleton.lazy;


import java.io.Serializable;

public class LazySimpleSingleton implements Serializable {

    private static LazySimpleSingleton lazySimpleSingleton=null;

    private LazySimpleSingleton(){
        if(null!=lazySimpleSingleton){
            throw new RuntimeException("不允许创建多个实例");
        }
    };

    //线程安全问题,在方法上加synchronized锁 太重
    public synchronized  static LazySimpleSingleton getInstance(){
        if(null==lazySimpleSingleton){
            lazySimpleSingleton=new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
