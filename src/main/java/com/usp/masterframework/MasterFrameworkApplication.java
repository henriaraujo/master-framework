package com.usp.masterframework;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class MasterFrameworkApplication {
	
	public static String extractJsonValueResponse(String text, String term) 
	{
			return "Value doesn't exists!";
	}
	
	public static void main(String[] args) throws IOException {
		//SpringApplication.run(MasterFrameworkApplication.class, args);
		
		//String testeString = "";
		
		URL url = new URL("https://nominatim.openstreetmap.org/search?q=Rua%20Liborio%20Marino%2040&format=json");
		HttpURLConnection conn = (HttpURLConnection)url.openConnection(); 
		conn.setRequestMethod("GET");
		conn.connect();
		
		int responsecode = conn.getResponseCode(); 
		if(responsecode != 200) throw new RuntimeException("HttpResponseCode: " +responsecode); 
		else { 
			
		}
		
		Scanner sc = new Scanner(url.openStream());
		String inline = "";
		while(sc.hasNext())
		{
		inline+=sc.nextLine();
		}
		System.out.println("\nJSON data in string format");
		System.out.println(inline);
		sc.close();
		//String lat = "\""+playerName+"\""
		
		//"lat":"
	//String lat, lon;
	
	//lat = inline.substring(0, 10);
	
	//System.out.println(lat);
	//System.out.println(extractDataFromJsonString(inline, "\""+"lat"+"\""+":"+"\""));
	
	//String s1="that is index of example";  
	//passing substring  
	String latSearch = "\""+"lat"+"\""+":"+"\"";
	int index = inline.indexOf(latSearch)  + latSearch.length();//returns the index of is substring
	String latCatch = inline.substring(index);
	System.out.println(latCatch);//2 8  

	}
}
