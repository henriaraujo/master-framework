package com.usp.masterframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usp.masterframework.documents.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
