package com.demo.EcommerceApp.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.EcommerceApp.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
		
}
