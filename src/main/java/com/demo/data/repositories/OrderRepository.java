package com.demo.data.repositories;

import com.demo.data.models.Order;
import com.demo.data.models.User;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.domain.Pageable;
import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByZip(String deliveryZip);

    List<Order> readOrdersByZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);

    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}
