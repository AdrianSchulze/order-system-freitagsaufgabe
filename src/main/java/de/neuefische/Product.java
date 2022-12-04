package de.neuefische;

import lombok.Data;

@Data
public class Product {
    String id;
    String name;


    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

}
