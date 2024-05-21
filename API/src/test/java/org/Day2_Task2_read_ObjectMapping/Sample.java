package org.Day2_Task2_read_ObjectMapping;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		
		File file=new File("D:\\maven\\maven work spsce\\API\\src\\test\\resources\\Object_mapping_Day2_TASK2.json");
		
		ObjectMapper mappre=new ObjectMapper();
		
		Pojo r = mappre.readValue(file, Pojo.class);
		
		int page = r.getPage();
		int per_page = r.getPer_page();
		int total = r.getTotal();
		int total_pages = r.getTotal_pages();
		
		System.out.println(page);
		System.out.println(per_page);
		System.out.println(total);
		System.out.println(total_pages);
		
		System.out.println(".........DATA ARRAY.........");
		ArrayList<Datum> data = r.getData();
		
		//System.out.println(data);
		
			for (Datum datum : data) {
				System.out.println(datum.getId());
				System.out.println(datum.getFlightName());
				System.out.println(datum.getCountry());
				System.out.println(datum.getDestinations());
				System.out.println(datum.getURL());
			}

System.out.println(".........support...........");

         Support support = r.getSupport();
         
         String text = support.getText();
         String url = support.getUrl();
         
         System.out.println(text);
			System.out.println(url);
		
			
		

		
		
	}

}
