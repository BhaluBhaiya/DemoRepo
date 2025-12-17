package com.demo.EcommerceApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.EcommerceApp.dao.ItemDao;
import com.demo.EcommerceApp.dtos.ItemDto;
import com.demo.EcommerceApp.entities.Item;
import com.demo.EcommerceApp.exceptions.ItemNotFoundException;


@Service
public class ItemService implements ItemServiceInterface{
	
	@Autowired
	ItemDao dao;

	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Item findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id)
				.orElseThrow(()->new ItemNotFoundException("No item present with id: "+id));
	}

	@Override
	@Transactional
	public Item save(ItemDto itemDto) {
		// TODO Auto-generated method stub
		Item item = new Item();
		item.setItemId(itemDto.getItemId());
		item.setItemCost(itemDto.getItemCost());
		item.setItemName(itemDto.getItemName());
		return dao.save(item);
	}

	@Override
	@Transactional
	public Item update(Item item, Long id) {
		Item exist = dao.findById(id).orElseThrow(()->new ItemNotFoundException("No item present with this id."));

			exist.setItemName(item.getItemName());
			exist.setItemCost(item.getItemCost());
			return dao.update(exist);

	}

	@Override
	@Transactional
	public void delete(Long id) {

		Item exist = dao.findById(id).orElseThrow(()->new ItemNotFoundException("No item present with this id."));
			dao.delete(id);
			System.err.println("Item Deleted");
	}

	

}
