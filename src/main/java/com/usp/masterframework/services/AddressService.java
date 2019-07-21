package com.usp.masterframework.services;

import java.util.List;
import java.util.Optional;

import com.usp.masterframework.documents.Address;

public interface AddressService {
	 List<Address> listAll();
	 
	 Optional <Address> listById(Integer id);
	 
	 Address register (Address address);
	 
	 Address update(Address address);
	 
	 void remove(Integer Id);
	
	
	
	//String getLatitude (String addressName);
	//String getLongtitude (String addressName);
}
