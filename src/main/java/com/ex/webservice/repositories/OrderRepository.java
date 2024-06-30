package com.ex.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
