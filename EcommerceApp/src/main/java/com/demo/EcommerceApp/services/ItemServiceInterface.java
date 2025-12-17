package com.demo.EcommerceApp.services;

import java.util.List;
import java.util.Optional;

import com.demo.EcommerceApp.dtos.ItemDto;
import com.demo.EcommerceApp.entities.Item;


public interface ItemServiceInterface {
	public List<Item> findAll();
	public Item findById(Long Id);
	public Item save(ItemDto itemDto);
	public Item update(Item item , Long Id);
	public void delete(Long Id);
}
