package com.demo.pg_accomodation.services;

import java.util.List;

import com.demo.pg_accomodation.entities.Admin;


public interface AdminServiceInterface {
	public List<Admin> findAll();
	public Admin findById(Long id);
//	public Admin save(ItemDto itemDto);
	public Admin update(Admin admin , Long id);
	public void delete(Long id);
}
