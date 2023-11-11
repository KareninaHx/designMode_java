package org.learn.hq.p1.c1;

/*
表示集合的接口
 */

public interface Aggregate {
    /*
    该方法用于生成一个 迭代器
     */
    public abstract Iterator iterator();
}
