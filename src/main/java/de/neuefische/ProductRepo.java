package de.neuefische;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ProductRepo {
    List<Product> products;

    public List<Product> list() {
       return products;
    }

    public Product get(String idx) {
        if(products != null) {
            for (Product product : products) {
                if (product.getId().equals(idx)) {
                    return product;
                }
            }
            return null;
        }
        else {
            throw new IllegalArgumentException("Konnte kein Produkt finden");
        }
    }
}
