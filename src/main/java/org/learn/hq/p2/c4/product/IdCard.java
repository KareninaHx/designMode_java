package org.learn.hq.p2.c4.product;

import org.learn.hq.p2.c4.framework.Product;

/**
 * Created by 27 on 2023/11/12
 */
public class IdCard extends Product {
    private String owner;
    private String code;

    public IdCard(String owner,String code){
        System.out.println("制作"+owner+"的卡");
        this.owner = owner;
        this.code = code;
    }

    @Override
    public void use() {
        System.out.println("使用了"+owner+"的id card");
        System.out.println("其中卡号为"+getCode());
    }

    public String getOwner(){
        return owner;
    }
    public String getCode(){
        return code;
    }
}
