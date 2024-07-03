package com.ex.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.webservice.entities.OrderItem;
import com.ex.webservice.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
