package com.usp.masterframework;


import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.GeocodingApiRequest;
import com.google.maps.errors.ApiException;
import com.google.maps.model.DistanceMatrix;
import com.google.maps.model.GeocodingResult;



@SpringBootApplication
public class MasterFrameworkApplication {
	public static final String GoogleMapsKEY = "AIzaSyAl_OhUmGOTt-c1Zt1y9ne0M8MXlc5Sotg";
	public static void main(String[] args) throws ApiException, InterruptedException, IOException{
		//SpringApplication.run(MasterFrameworkApplication.class, args);
		
		GeoApiContext context = new GeoApiContext.Builder()
			    .apiKey(MasterFrameworkApplication.GoogleMapsKEY)
			    .build();
		
		

	//GeocodingResult result = GeocodingApi.geocode(context, "R. Libório Marino, 40 - Jardim Nova Santa Paula, São Carlos - SP, 13564-340"
	//		).latlng(latlng);
			
			
	
		
			GeocodingResult[] results =  GeocodingApi.geocode(context,
			    "R. Libório Marino, 40 - Jardim Nova Santa Paula, São Carlos - SP, 13564-340").await();
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
		
			System.out.println(gson.toJson(results[0].geometry.location));
		

			
			//DistanceMatrix distance = new DistanceMatri
			
	}
}
