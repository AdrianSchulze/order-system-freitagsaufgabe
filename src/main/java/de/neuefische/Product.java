package de.neuefische;

import lombok.Data;

@Data
public class Product {
    int id;
    String name;

    public Product() {

    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
