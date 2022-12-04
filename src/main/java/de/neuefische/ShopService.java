package de.neuefische;

import lombok.Data;

import java.util.List;


@Data
public class ShopService {
    ProductRepo productRepo;
    OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public Product getProduct(String idx){
       return productRepo.get(idx);
   }

    public List<Product> listProducts() {
        return productRepo.list();
    }

    public void addOrder(Order order) {
        orderRepo.add(order);
    }

    public Order getOrder(String idx) {
        return orderRepo.get(idx);
    }

    public List<Order> listOrders() {
        return orderRepo.list();
    }

}
