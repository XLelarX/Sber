package com.company;

import java.util.Map;
import java.util.Scanner;

public class Client {
    private final Server server;
    private Map<Product, Integer> products;
    private Scanner in = new Scanner(System.in);

    public Client(Server server) {
        this.server = server;
    }

    public void start() {
        while (true) {
            refreshProducts();
            System.out.println(products);

            System.out.println("Введите номер операции :");
            switch (in.nextInt()) {
                case 1: {
                    for (Product product : Product.values()) {
                        System.out.println(String.format("%d: %s %d", product.ordinal(), product.name(), products.get(product)));
                    }
                    System.out.println("Введите номер товара");
                    Product product = Product.values()[in.nextInt()];
                    System.out.println(product);
                    System.out.println("Введите количество");
                    Integer amount = in.nextInt();
                    buyItem(product, amount);

                    break;
                }
                default: return;
            }

        }
    }

    public void refreshProducts() {
        this.products = server.getProducts();
    }

    public void buyItem(Product item, Integer amount) {
        if (products.get(item) > amount) {
            try {
                server.buyItem(item, amount);
            } catch (BusinessLogicException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
