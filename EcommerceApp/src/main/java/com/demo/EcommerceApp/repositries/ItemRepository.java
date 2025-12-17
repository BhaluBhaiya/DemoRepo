package com.demo.EcommerceApp.repositries;


import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.EcommerceApp.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
	
}
