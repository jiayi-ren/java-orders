package local.jren.orders.services;

import local.jren.orders.models.Order;
import local.jren.orders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "orderService")
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order findOrderById(long id) {
        return orderRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Order "+id+" Not Found"));
    }
}
