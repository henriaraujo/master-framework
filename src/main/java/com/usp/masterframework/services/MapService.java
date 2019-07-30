package com.usp.masterframework.services;

import java.io.IOException;

import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;

public interface MapService {
	GeocodingResult getFullAddresInformation (String address) throws ApiException, InterruptedException, IOException;
	Double getLatitude(String address) throws ApiException, InterruptedException, IOException;
	Double getLongitude(String address)throws ApiException, InterruptedException, IOException;
	String getDistanceBetweenTwoAddresses(String address, String address2) throws ApiException, InterruptedException, IOException;
	String getRouteAmongAddresses(String[] adresses) throws ApiException, InterruptedException, IOException;
}
