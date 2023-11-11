package org.learn.hq.p1.c2;

/**
 * Created by 27 on 2023/11/11
 */
public class BannerMain {
    public static void main(String[] args) {
        /*
        对象适配器模式
        */
        System.out.println("===============对象适配器模式=============");
        Banner banner = new Banner("hello");
        Print_ print_ = new BannerPrint_(banner);
        print_.printWeak();
        print_.printStrong();
        /*
        类适配器模式
         */
        System.out.println("===============类适配器模式=============");
        Print print = new BannerPrint("hello");
        print.printWeak();
        print.printStrong();
    }
}
