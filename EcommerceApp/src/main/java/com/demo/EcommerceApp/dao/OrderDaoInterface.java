package com.demo.EcommerceApp.dao;

import java.util.List;
import java.util.Optional;

import com.demo.EcommerceApp.entities.Order;

public interface OrderDaoInterface {
	public List<Order> findAll();
	public Optional<Order> findById(Long id);
	public Order save(Order order);
	public Order update(Order order);
	public void delete(Long id);
}
