package com.demo.EcommerceApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.EcommerceApp.dtos.OrderDto;
import com.demo.EcommerceApp.entities.Order;
import com.demo.EcommerceApp.exceptions.IllegalArgumentException;
import com.demo.EcommerceApp.services.OrderService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Order>> findAll(){
		return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		if(id<=0)
			throw new IllegalArgumentException("Id cannot be 0 or negative");
		return new ResponseEntity<>(service.findById(id), HttpStatus.FOUND);
	}
	
	@PostMapping("/")
	public ResponseEntity<Order> save(@Valid @RequestBody OrderDto orderDto){
		Order order = new Order();
		order.setCustomerName(orderDto.getCustomerName());
		order.setOrdDate(orderDto.getOrdDate());
		return new ResponseEntity<>(service.save(order, orderDto.getItemIds()),HttpStatus.ACCEPTED.OK);
		
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		if(id<=0)
			throw new IllegalArgumentException("Id cannot be 0 or negative");
		service.delete(id);
		return ResponseEntity.status(HttpStatus.OK)
				.body("Item Deleted!!");
	}
}
