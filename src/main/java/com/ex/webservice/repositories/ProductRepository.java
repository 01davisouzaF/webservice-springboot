package com.ex.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
