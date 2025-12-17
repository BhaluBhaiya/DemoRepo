package com.demo.pg_accomodation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pg_accomodation.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{

}
