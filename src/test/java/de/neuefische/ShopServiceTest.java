package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ShopServiceTest {


        @Test
        void ifGetIsGivingTheCorrectProductBack() {
            //GIVEN
            Product product1 = new Product ("123", "Stein");
            Product product2 = new Product ("234", "Kiesel");
            ArrayList<Product> newProductList = new ArrayList<>();
            newProductList.add(product1);
            newProductList.add(product2);
            ProductRepo productRepo = new ProductRepo(newProductList);
            Order order1 = new Order("23324", newProductList);
            Order order2 = new Order("54364", newProductList);
            ArrayList<Order> newOrderList = new ArrayList<>();
            newOrderList.add(order1);
            newOrderList.add(order2);
            OrderRepo orderRepo = new OrderRepo(newOrderList);
            ShopService shopService = new ShopService(productRepo,orderRepo);
            //WHEN
            Product actual = shopService.getProduct("123");
            //THEN
            Assertions.assertEquals(new Product ("123", "Stein"),actual);
        }

    @Test
    void ifListProductsIsGivingTheCorrectListBack() {
        //GIVEN
        Product product1 = new Product ("123", "Stein");
        Product product2 = new Product ("234", "Kiesel");
        ArrayList<Product> newProductList = new ArrayList<>();
        newProductList.add(product1);
        newProductList.add(product2);
        ProductRepo productRepo = new ProductRepo(newProductList);
        Order order1 = new Order("23324", newProductList);
        Order order2 = new Order("54364", newProductList);
        ArrayList<Order> newOrderList = new ArrayList<>();
        newOrderList.add(order1);
        newOrderList.add(order2);
        OrderRepo orderRepo = new OrderRepo(newOrderList);
        ShopService shopService = new ShopService(productRepo,orderRepo);
        //WHEN
        List<Product> actual = shopService.listProducts();
        //THEN
        Assertions.assertEquals(newProductList,actual);
    }

    @Test
    void ifAddOrderIsAddingtheCorrectItems() {
        //GIVEN
        Product product1 = new Product ("123", "Stein");
        Product product2 = new Product ("234", "Kiesel");
        ArrayList<Product> newProductList = new ArrayList<>();
        newProductList.add(product1);
        newProductList.add(product2);
        ProductRepo productRepo = new ProductRepo(newProductList);
        Order order1 = new Order("23324", newProductList);
        Order order2 = new Order("54364", newProductList);
        ArrayList<Order> newOrderList = new ArrayList<>();
        newOrderList.add(order1);
        newOrderList.add(order2);
        OrderRepo orderRepo = new OrderRepo(newOrderList);
        ShopService shopService = new ShopService(productRepo,orderRepo);
        //WHEN
        shopService.addOrder(new Order("76767676", newProductList));
        List<Order> actual = shopService.listOrders();
        //THEN
        Assertions.assertEquals(new ArrayList<>(List.of(order1,order2,new Order("76767676", newProductList))),actual);
    }

    @Test
    void ifGetIsGivingTheCorrectItemBack() {
        //GIVEN
        Product product1 = new Product ("123", "Stein");
        Product product2 = new Product ("234", "Kiesel");
        ArrayList<Product> newProductList = new ArrayList<>();
        newProductList.add(product1);
        newProductList.add(product2);
        ProductRepo productRepo = new ProductRepo(newProductList);
        Order order1 = new Order("23324", newProductList);
        Order order2 = new Order("54364", newProductList);
        ArrayList<Order> newOrderList = new ArrayList<>();
        newOrderList.add(order1);
        newOrderList.add(order2);
        OrderRepo orderRepo = new OrderRepo(newOrderList);
        ShopService shopService = new ShopService(productRepo, orderRepo);
        //WHEN
        Order actual = shopService.getOrder("54364");
        //THEN
        Assertions.assertEquals(new Order("54364", newProductList),actual);
    }

    @Test
    void ifListOrdersIsGivingTheCorrectListBack() {
        //GIVEN
        Product product1 = new Product ("123", "Stein");
        Product product2 = new Product ("234", "Kiesel");
        ArrayList<Product> newProductList = new ArrayList<>();
        newProductList.add(product1);
        newProductList.add(product2);
        ProductRepo productRepo = new ProductRepo(newProductList);
        Order order1 = new Order("23324", newProductList);
        Order order2 = new Order("54364", newProductList);
        ArrayList<Order> newOrderList = new ArrayList<>();
        newOrderList.add(order1);
        newOrderList.add(order2);
        OrderRepo orderRepo = new OrderRepo(newOrderList);
        ShopService shopService = new ShopService(productRepo, orderRepo);
        //WHEN
        List<Order> actual = shopService.listOrders();
        //THEN
        Assertions.assertEquals(new ArrayList<>(List.of(order1,order2)),actual);
    }

}