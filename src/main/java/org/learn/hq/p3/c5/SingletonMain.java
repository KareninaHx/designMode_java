package org.learn.hq.p3.c5;

/**
 * Created by 27 on 2023/11/12
 */
public class SingletonMain {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1 == s2){
            System.out.println("s1和s2是相同实例");
        }else{
            System.out.println("s1和s2不是相同的实例");
        }
    }
}
