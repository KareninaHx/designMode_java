package org.learn.hq.p2.c4.framework;

/**
 * Created by 27 on 2023/11/12
 */
public abstract class Factory {

    public final Product create(String owner,String code){
        Product p = createProduct(owner,code);
        registerProduct(p);
        return p;
    }
    public abstract Product createProduct(String owner,String code);
    public abstract void registerProduct(Product product);
}
