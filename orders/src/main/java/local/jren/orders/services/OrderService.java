package local.jren.orders.services;

import local.jren.orders.models.Order;

public interface OrderService {
    Order findOrderById(long id);
}
