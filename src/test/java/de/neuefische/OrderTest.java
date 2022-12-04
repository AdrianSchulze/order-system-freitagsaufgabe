package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class OrderTest {

    @Test
    void orderIsCorrectlyInitialized() {
        //GIVEN
        ArrayList<Product> product = new ArrayList<>();
        product.add(new Product ("123", "Stein"));
        product.add(new Product ("234", "Fisch"));
        Order order = new Order("123",product);
        //WHEN
        List<Product> actual = order.getProducts();
        //THEN
        Assertions.assertEquals(product,actual);
    }

}