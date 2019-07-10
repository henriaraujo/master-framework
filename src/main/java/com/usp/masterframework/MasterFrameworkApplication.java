package com.usp.masterframework;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;


@SpringBootApplication
public class MasterFrameworkApplication {

	
		
		
		
		//System.out.println(gson.toJson(results[0].addressComponents));
	public static void main(String[] args) throws ApiException, InterruptedException, IOException {
		
		/*System.out.println("BoBo");
		
		GeoApiContext context = new GeoApiContext.Builder()
			    .apiKey("AIzaSyAl_OhUmGOTt-c1Zt1y9ne0M8MXlc5Sotg")
			    .build();
			GeocodingResult[] results =  GeocodingApi.geocode(context,
			    "1600 Amphitheatre Parkway Mountain View, CA 94043").await();
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			System.out.println(gson.toJson(results[0].addressComponents));*/
		SpringApplication.run(MasterFrameworkApplication.class, args);
	}

}
