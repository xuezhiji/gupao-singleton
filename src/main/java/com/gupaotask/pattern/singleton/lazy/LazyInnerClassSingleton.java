package com.gupaotask.pattern.singleton.lazy;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        if(null!=holdLazy.lazyInnerClassSingleton){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        return holdLazy.lazyInnerClassSingleton;
    }

    public static class holdLazy {
        private static final LazyInnerClassSingleton lazyInnerClassSingleton=new LazyInnerClassSingleton();
    }

}
