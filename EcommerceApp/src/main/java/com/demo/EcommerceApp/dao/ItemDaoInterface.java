package com.demo.EcommerceApp.dao;

import java.util.List;
import java.util.Optional;

import com.demo.EcommerceApp.entities.Item;


public interface ItemDaoInterface {
	public List<Item> findAll();
	public Optional<Item> findById(Long id);
	public Item save(Item item);
	public Item update(Item item);
	public void delete(Long id);
	public List<Item> findItemsByIds(List<Long> ids);
	
}
