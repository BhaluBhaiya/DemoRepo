package com.demo.EcommerceApp.services;

import java.util.List;

import com.demo.EcommerceApp.entities.Order;

public interface OrderServiceInterface {
	public List<Order> findAll();
	public Order findById(Long id);
	public Order save(Order order,List<Long> itemIds);
	public Order update(Order order , Long id);
	public void delete(Long id);
}
