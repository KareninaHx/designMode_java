package org.learn.hq.p1.c2;

/**
 * Created by 27 on 2023/11/11
 */
/*
 实际情况；交流100伏特
 */
public class Banner{

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("("+string+")");
    }

    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
