package com.foodOrder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodOrder.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
