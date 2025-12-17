package com.demo.Day24.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Day24.entities.User;

public interface UserInterface extends JpaRepository<User, Long>{

}
