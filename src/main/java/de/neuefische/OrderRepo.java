package de.neuefische;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class OrderRepo {
    List<Order> orders;

    public List<Order> list() {
        return orders;
    }

    public Order get(String idx) {
        for (Order order : orders) {
            if (order.getId().equals(idx)) {
                return order;
            }
        }
        return null;
    }

    public void add(Order order) {
        orders.add(order);
    }
}
