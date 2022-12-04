package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void productNameIsSavedCorrectly() {
        //GIVEN
        Product product = new Product("123", "Kieselsteine");
        //WHEN
        String actual = product.getName();
        //THEN
        Assertions.assertEquals("Kieselsteine",actual);
    }

    @Test
    void productIdIsSavedCorrectly() {
        //GIVEN
        Product product = new Product("123", "Kieselsteine");
        //WHEN
        String actual = product.getId();
        //THEN
        Assertions.assertEquals("123",actual);
    }

}