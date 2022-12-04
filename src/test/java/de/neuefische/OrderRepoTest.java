package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class OrderRepoTest {

    @Test
    void ifOrderIsCorrectlyInitialized() {
        //GIVEN
        Product product1 = new Product ("123", "Stein");
        Product product2 = new Product ("234", "Kiesel");
        ArrayList<Product> newProductList = new ArrayList<>();
        newProductList.add(product1);
        newProductList.add(product2);
        Order order1 = new Order("23324", newProductList);
        ArrayList<Order> newOrderList = new ArrayList<>();
        newOrderList.add(order1);
        OrderRepo orderRepo = new OrderRepo(newOrderList);
        //WHEN
        List<Order> actual = orderRepo.getOrders();
        //THEN
        Assertions.assertEquals(new ArrayList<>(List.of(order1)),actual);
    }

    @Test
    void ifListIsGivingTheCorrectListBack() {
        //GIVEN
        Product product1 = new Product ("123", "Stein");
        Product product2 = new Product ("234", "Kiesel");
        ArrayList<Product> newProductList = new ArrayList<>();
        newProductList.add(product1);
        newProductList.add(product2);
        Order order1 = new Order("23324", newProductList);
        ArrayList<Order> newOrderList = new ArrayList<>();
        newOrderList.add(order1);
        OrderRepo orderRepo = new OrderRepo(newOrderList);
        //WHEN
        List<Order> actual = orderRepo.list();
        //THEN
        Assertions.assertEquals(new ArrayList<>(List.of(order1)),actual);
    }

    @Test
    void ifGetIsGivingTheCorrectListBack() {
        //GIVEN
        Product product1 = new Product ("123", "Stein");
        Product product2 = new Product ("234", "Kiesel");
        ArrayList<Product> newProductList = new ArrayList<>();
        newProductList.add(product1);
        newProductList.add(product2);
        Order order1 = new Order("23324", newProductList);
        Order order2 = new Order("54364", newProductList);
        ArrayList<Order> newOrderList = new ArrayList<>();
        newOrderList.add(order1);
        newOrderList.add(order2);
        OrderRepo orderRepo = new OrderRepo(newOrderList);
        //WHEN
        Order actual = orderRepo.get("54364");
        //THEN
        Assertions.assertEquals(new Order("54364", newProductList),actual);
    }

    @Test
    void ifOrderCorrectlyAdded() {
        //GIVEN
        Product product1 = new Product ("123", "Stein");
        Product product2 = new Product ("234", "Kiesel");
        ArrayList<Product> newProductList = new ArrayList<>();
        newProductList.add(product1);
        newProductList.add(product2);
        Order order1 = new Order("23324", newProductList);
        Order order2 = new Order("54364", newProductList);
        ArrayList<Order> newOrderList = new ArrayList<>();
        newOrderList.add(order1);
        newOrderList.add(order2);
        OrderRepo orderRepo = new OrderRepo(newOrderList);
        //WHEN
        orderRepo.add(new Order("757575", newProductList));
        List<Order> actual = orderRepo.list();
        //THEN
        Assertions.assertEquals(new ArrayList<>(List.of(order1,order2,new Order("757575", newProductList))),actual);
    }
}