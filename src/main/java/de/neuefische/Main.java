package de.neuefische;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product (123, "Stein");
        Product product2 = new Product (234, "Kiesel");

        ArrayList<Product> newProductList = new ArrayList<>();

        newProductList.add(product1);
        newProductList.add(product2);

        ProductRepo productRepo = new ProductRepo(newProductList);

        Order order1 = new Order(23324, newProductList);
        Order order2 = new Order(3452, newProductList);

        ArrayList<Order> newOrderList = new ArrayList<>();
        newOrderList.add(order1);
        newOrderList.add(order2);

        OrderRepo orderRepo = new OrderRepo(newOrderList);

        ShopService shopService = new ShopService(productRepo,orderRepo);

        System.out.println(productRepo);
        System.out.println(newOrderList);
        System.out.println(shopService);


    }
}