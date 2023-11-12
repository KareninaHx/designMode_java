package org.learn.hq.p2.c4.product;

import org.learn.hq.p2.c4.framework.Factory;
import org.learn.hq.p2.c4.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 27 on 2023/11/12
 */
public class IdCardFactory extends Factory {
    List<String> owners = new ArrayList<>();

    @Override
    public Product createProduct(String owner,String code) {
        return new IdCard(owner,code);
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IdCard)product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
