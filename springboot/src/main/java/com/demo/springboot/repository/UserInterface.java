package com.demo.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.springboot.entities.User;

public interface UserInterface extends JpaRepository<User, Long>{

}
