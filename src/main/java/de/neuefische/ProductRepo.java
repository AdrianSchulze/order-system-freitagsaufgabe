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

    public Product get(int idx) {
        if(products != null) {
            return products.get(idx);
        }
        else {
            throw new IllegalArgumentException("Konnte kein Produkt finden");
        }
    }
}
