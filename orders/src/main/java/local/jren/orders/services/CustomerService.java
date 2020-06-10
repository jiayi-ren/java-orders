package local.jren.orders.services;

import local.jren.orders.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomers();
    Customer findCustomerById(long id);
    List<Customer> findByNameLike(String thename);
}
