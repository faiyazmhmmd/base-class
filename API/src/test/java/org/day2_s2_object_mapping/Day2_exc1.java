package org.day2_s2_object_mapping;

import java.io.File;
import java.io.IOException;

import javax.xml.datatype.DatatypeConstants.Field;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Day2_exc1 {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file=new File("D:\\maven\\maven work spsce\\API\\src\\test\\resources\\Object_mapping_exc1.json");
		
		ObjectMapper mapper=new ObjectMapper();
		
		Exc1_pojoclass e=mapper.readValue(file, Exc1_pojoclass.class);
		
		String name = e.getName();
		String email = e.getEmail();
		Boolean payment = e.getPayment();
		String phoneN0 = e.getPhoneN0();
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(payment);
		System.out.println(phoneN0);
		
		
		

	}

}
