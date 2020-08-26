package com.demo.data.repositories;

import com.demo.data.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

    
}
