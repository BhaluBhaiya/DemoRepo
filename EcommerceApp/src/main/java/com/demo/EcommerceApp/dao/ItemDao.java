package com.demo.EcommerceApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.EcommerceApp.entities.Item;
import com.demo.EcommerceApp.exceptions.ItemNotFoundException;
import com.demo.EcommerceApp.repositries.ItemRepository;

@Repository
public class ItemDao implements ItemDaoInterface{

	@Autowired
	ItemRepository repository;

	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Item> findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Item save(Item item) {
		// TODO Auto-generated method stub
		return repository.save(item);
	}

	@Override
	public Item update(Item item) {
		return repository.save(item);
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Item> findItemsByIds(List<Long> ids) {
		return repository.findAllById(ids);
	}

	


}
