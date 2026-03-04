package com.zakiah.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zakiah.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}