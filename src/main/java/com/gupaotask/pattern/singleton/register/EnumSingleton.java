package com.gupaotask.pattern.singleton.register;

public enum EnumSingleton {

    INSTANCE;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
