package com.demo.pg_accomodation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pg_accomodation.entities.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long>{

}
