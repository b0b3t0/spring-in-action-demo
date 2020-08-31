package com.demo.data.repositories;

import com.demo.data.models.Order;
import com.demo.data.models.User;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;
import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByZip(String deliveryZip);

    List<Order> readOrdersByZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);

    List<Order> findByUserOrderByPlaceAtDesc(User user, Pageable pageable);
}
