package com.gupaotask.pattern.singleton.lazy;

public class LazyDoubleCheckSingleton {

    private static volatile LazyDoubleCheckSingleton doubleCheckSingleton=null;

    private LazyDoubleCheckSingleton(){
        if(null!= doubleCheckSingleton){
        throw new RuntimeException("不允许创建多个实例");
    }}

    public static LazyDoubleCheckSingleton getInstance(){
        if(null==doubleCheckSingleton){
            synchronized (LazyDoubleCheckSingleton.class){
                if(null==doubleCheckSingleton){
                    doubleCheckSingleton=new LazyDoubleCheckSingleton();

                }
            }

        }
        return doubleCheckSingleton;
    }
}
