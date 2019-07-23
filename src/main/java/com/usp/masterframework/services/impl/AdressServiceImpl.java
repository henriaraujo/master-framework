package com.usp.masterframework.services.impl;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usp.masterframework.documents.Address;
import com.usp.masterframework.repositories.AddressRepository;
import com.usp.masterframework.services.AddressService;

@Service
public class AdressServiceImpl implements AddressService{

	@Autowired
	private AddressRepository addressRepository;
	

	@Override
	public List<Address> listAll() {
		return this.addressRepository.findAll();
	}

	@Override
	public Optional<Address> listById(Integer id) {
		return this.addressRepository.findById(id);
	}

	@Override
	public Address register(Address address) {
		return this.addressRepository.save(address);
	}
	
	@Override
	public Address update(Address address) {
		return this.addressRepository.save(address);
	}
	
	@Override
	public void remove(Integer id) {
		this.addressRepository.deleteById(id);
	}

	@Override
	public String getLatitude(String addressName)  throws IOException{
		
		return null;
	}

	@Override
	public String getLongitude(String addressName)  throws IOException{
		return null;
	}
	
	

}
