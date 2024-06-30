package com.ex.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
