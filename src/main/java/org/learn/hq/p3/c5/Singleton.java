package org.learn.hq.p3.c5;

/**
 * Created by 27 on 2023/11/12
 */
/*
单例模式
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("创建了单一的实例");
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
