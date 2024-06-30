package com.ex.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
