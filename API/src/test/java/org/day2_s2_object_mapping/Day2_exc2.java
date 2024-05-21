package org.day2_s2_object_mapping;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Day2_exc2 {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

	File file=new File("D:\\maven\\maven work spsce\\API\\src\\test\\resources\\Object_mapping_Day2_exc2.json");
	
	ObjectMapper objectmapper=new ObjectMapper();
	
	Exc2_pojoclass s= objectmapper.readValue(file, Exc2_pojoclass.class);
	
	String name = s.getName();
	String email = s.getEmail();
	long phoneN0 = s.getPhoneN0();
	
	
	System.out.println(name);
	System.out.println(email);
	System.out.println(phoneN0);
	
	System.out.println(".............Addrass.................");
	
	Adress a = s.getAddress();
	String streetName = a.getStreetName();
	String stateName = a.getStateName();
	int pincode = a.getPincode();
	
	System.out.println(stateName);
	System.out.println(streetName);
	System.out.println(pincode);
	
	
	
	
	}
}
