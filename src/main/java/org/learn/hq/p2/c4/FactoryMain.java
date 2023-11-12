package org.learn.hq.p2.c4;

import org.learn.hq.p2.c4.framework.Factory;
import org.learn.hq.p2.c4.framework.Product;
import org.learn.hq.p2.c4.product.IdCardFactory;

/**
 * Created by 27 on 2023/11/12
 */
public class FactoryMain {
    public static void main(String[] args) {
        Factory factory = new IdCardFactory();
    //    生产产品
        Product product1 = factory.create("小明","123232");
        Product product2 = factory.create("小红","2232932");
        Product product3 = factory.create("小七","uwe223");

        product1.use();
        product2.use();
        product3.use();
    }
}
