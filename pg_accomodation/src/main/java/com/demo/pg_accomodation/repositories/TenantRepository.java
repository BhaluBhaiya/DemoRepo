package com.demo.pg_accomodation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pg_accomodation.entities.Tenant;

public interface TenantRepository extends JpaRepository<Tenant, Long>{

}
