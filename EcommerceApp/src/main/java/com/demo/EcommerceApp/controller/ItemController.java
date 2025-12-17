package com.demo.EcommerceApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.EcommerceApp.dtos.ItemDto;
import com.demo.EcommerceApp.entities.Item;
import com.demo.EcommerceApp.exceptions.IllegalArgumentException;
import com.demo.EcommerceApp.services.ItemService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	ItemService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Item>> findAll(){
		return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Item> findById(@PathVariable Long id) {
		if(id<=0)
			throw new IllegalArgumentException("Id cannot be 0 or negative");
		return new ResponseEntity<>(service.findById(id), HttpStatus.FOUND);
	}
	
	@PostMapping("/")
	public ResponseEntity<String> save(@Valid @RequestBody ItemDto itemDto) {
		if(itemDto.getItemCost()<=1000.00)
			throw new IllegalArgumentException("Item cost must be greater than 1000");
		if(itemDto.getItemName().length() <3)
			throw new IllegalArgumentException("Item name must be atleast 3 characters long");
		service.save(itemDto);
		return ResponseEntity.status(HttpStatus.OK)
				.body("Item Added Succesfully");
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Item> update(@Valid @RequestBody Item item,@PathVariable Long id) {
		if(id<=0)
			throw new IllegalArgumentException("Id cannot be 0 or negative");
		return new ResponseEntity<>(service.update(item, id), HttpStatus.OK);
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
