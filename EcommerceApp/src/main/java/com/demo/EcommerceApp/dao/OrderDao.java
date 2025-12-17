package com.demo.EcommerceApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.EcommerceApp.entities.Order;
import com.demo.EcommerceApp.repositries.OrderRepository;

@Repository
public class OrderDao implements OrderDaoInterface{
	
	
	@Autowired
	OrderRepository repository;

	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Order> findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Order save(Order order) {
		// TODO Auto-generated method stub
		return repository.save(order);
	}

	@Override
	public Order update(Order order) {
		return repository.save(order);
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

}
