package com.demo.EcommerceApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.EcommerceApp.dao.ItemDao;
import com.demo.EcommerceApp.dao.OrderDao;
import com.demo.EcommerceApp.entities.Order;
import com.demo.EcommerceApp.exceptions.OrderNotFoundException;

@Service
public class OrderService implements OrderServiceInterface{
	
	@Autowired
	OrderDao dao;
	
	@Autowired
	ItemDao iDao;

	@Override
	public List<Order> findAll() {
		
		return dao.findAll();
	}

	@Override
	public Order findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElseThrow(()-> new OrderNotFoundException("No order present with id: "+id));
	}

	@Override
	public Order save(Order order, List<Long> itemIds) {
		order.setItemList(iDao.findItemsByIds(itemIds));
		return dao.save(order);
	}

	@Override
	public Order update(Order order, Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long Id) {
		// TODO Auto-generated method stub
		
	}

	
}
