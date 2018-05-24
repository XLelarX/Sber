package com.company;

import java.util.HashMap;
import java.util.Map;

class Storage {
    private final Map<Product, Integer> products;

    public Storage() {
        products = new HashMap<>();
        products.put(Product.IPAD, 13);
        products.put(Product.IPOD, 20);
        products.put(Product.IMAC, 20);
        products.put(Product.IPHONE, 20);
    }

    public Map<Product, Integer> getProducts() {
        return new HashMap<>(products);
    }


    public boolean isExists(Product item) {
        return products.get(item) >= 0;
    }

    public void removeItem(Product buyingItem, Integer amountOfBuyingItem){
        Integer amount = products.get(buyingItem);
        products.replace(buyingItem, amount - amountOfBuyingItem);
    }

}
