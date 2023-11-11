package org.learn.hq.p1.c1;

/*
遍历集合的接口
相当于 循环语句中的循环变量
 */
public interface Iterator {

    /*
    抽象方法
     */
    public abstract boolean hasNext();
    public abstract Object next();
}
