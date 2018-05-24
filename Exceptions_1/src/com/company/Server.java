package com.company;

import java.util.Map;
import java.util.Random;

public class Server {
    private final Storage storage = new Storage();

    public Map<Product, Integer> getProducts() {
        return storage.getProducts();
    }

    public void buyItem(Product buyingItem, Integer amountOfBuyingItem) throws BusinessLogicException {
        imitateAnotherClientsWork();
        checkForCount(buyingItem, amountOfBuyingItem);
        storage.removeItem(buyingItem, amountOfBuyingItem);
    }

    private void imitateAnotherClientsWork() {
        Random random = new Random();
        for (Product product : Product.values()) {
            if (random.nextInt(4) == 0) {
                int amountOfBuyingItem = random.nextInt(storage.getProducts().get(product)) + 1;
                storage.removeItem(product, amountOfBuyingItem);
            }
        }

    }

    private void checkForCount(Product product, Integer count) throws BusinessLogicException {
        if (storage.getProducts().get(product) < count)
            throw new BusinessLogicException("Нет такого количества эелементов");
    }
}
