package com.usp.masterframework.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.usp.masterframework.documents.Address;

public interface AddressService {
	 List<Address> listAll();
	 
	 Optional <Address> listById(Integer id);
	 
	 Address register (Address address) throws IOException;
	 
	 Address update(Address address);
	 
	 void remove(Integer Id);
	
	String getLatitude (String addressName)  throws IOException;
	
	String getLongitude (String addressName) throws IOException;
}
