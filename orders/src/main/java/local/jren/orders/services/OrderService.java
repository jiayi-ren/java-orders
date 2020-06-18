package local.jren.orders.services;

import local.jren.orders.models.Order;

import java.util.List;

public interface OrderService {
    Order findOrderById(long id);
    List<Order> findOrdersWithAdvanceAmount(double advance);
}
