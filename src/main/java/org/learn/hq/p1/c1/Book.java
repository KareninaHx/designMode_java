package org.learn.hq.p1.c1;

/**
 * Created by 27 on 2023/11/11
 */
/*
表示书的类
 */
public class Book {
    private String name;//书名

    public Book(){}

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
