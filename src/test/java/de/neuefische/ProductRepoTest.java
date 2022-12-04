package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ProductRepoTest {

    @Test
    void ifProductIsCorrectlyInitialized() {
        //GIVEN
        Product product1 = new Product ("123", "Stein");
        Product product2 = new Product ("234", "Kiesel");
        ArrayList<Product> newProductList = new ArrayList<>();
        newProductList.add(product1);
        newProductList.add(product2);
        ProductRepo productRepo = new ProductRepo(newProductList);
        //WHEN
        List<Product> actual = productRepo.getProducts();
        //THEN
        Assertions.assertEquals(newProductList,actual);
    }

    @Test
    void ifListIsGivingTheCorrectListBack() {
        //GIVEN
        Product product1 = new Product ("123", "Stein");
        Product product2 = new Product ("234", "Kiesel");
        ArrayList<Product> newProductList = new ArrayList<>();
        newProductList.add(product1);
        newProductList.add(product2);
        ProductRepo productRepo = new ProductRepo(newProductList);
        //WHEN
        List<Product> actual = productRepo.list();
        //THEN
        Assertions.assertEquals(new ArrayList<>(List.of(product1,product2)),actual);
    }

    @Test
    void ifGetIsGivingTheCorrectListBack() {
        //GIVEN
        Product product1 = new Product ("123", "Stein");
        Product product2 = new Product ("234", "Kiesel");
        ArrayList<Product> newProductList = new ArrayList<>();
        newProductList.add(product1);
        newProductList.add(product2);
        ProductRepo productRepo = new ProductRepo(newProductList);
        //WHEN
        Product actual = productRepo.get("123");
        //THEN
        Assertions.assertEquals(new Product ("123", "Stein"),actual);
    }

}