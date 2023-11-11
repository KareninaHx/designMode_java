package org.learn.hq.p1.c2;

/**
 * Created by 27 on 2023/11/11
 */
/*
变换装置；适配器；
 */
public class BannerPrint extends Banner implements Print{

    public BannerPrint(String string){
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
