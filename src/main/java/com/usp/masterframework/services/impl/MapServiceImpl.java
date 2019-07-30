package com.usp.masterframework.services.impl;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.DistanceMatrix;
import com.google.maps.model.GeocodingResult;
import com.usp.masterframework.MasterFrameworkApplication;
import com.usp.masterframework.services.MapService;

@Service
public class MapServiceImpl implements MapService{

	GeoApiContext context = new GeoApiContext.Builder()
		    .apiKey(MasterFrameworkApplication.GoogleMapsKEY)
		    .build();
	
	@Override
	public GeocodingResult getFullAddresInformation(String address)
			throws ApiException, InterruptedException, IOException {
		GeocodingResult[] results =  GeocodingApi.geocode(context,
			    address).await();
		return results[0];
	}

	
	@Override
	public Double getLatitude(String address) throws ApiException, InterruptedException, IOException {
		return getFullAddresInformation(address).geometry.location.lat;
	}

	@Override
	public Double getLongitude(String address) throws ApiException, InterruptedException, IOException {
		return getFullAddresInformation(address).geometry.location.lng;
	}

	@Override
	public String getDistanceBetweenTwoAddresses(String address, String address2) {
		return null;
	}

	@Override
	public String getRouteAmongAddresses(String[] adresses) {
		
		return null;
	}


}
