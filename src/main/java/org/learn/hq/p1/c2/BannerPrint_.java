package org.learn.hq.p1.c2;

/**
 * Created by 27 on 2023/11/11
 */
/*
变换装置；适配器；
 */
public class BannerPrint_ extends Print_{
    Banner banner;

    public BannerPrint_(Banner banner){
        this.banner = banner;
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
