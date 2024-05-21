package org.Day2_exc3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample1 {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		File file=new File("D:\\maven\\maven work spsce\\API\\src\\test\\resources\\Object_mapping_exc3_course.json");
		
		ObjectMapper objectMapper=new ObjectMapper();
		
	    Pojo readValue = objectMapper.readValue(file,Pojo.class);
	    
	    String name = readValue.getName();
	    System.out.println(name);
	    String email = readValue.getEmail();
	    long phoneN0 = readValue.getPhoneN0();
	    System.out.println(email);
	    System.out.println(phoneN0);
	    
	    System.out.println(".........course in array...........");
	    ArrayList<String> course = readValue.getCourse();
	    String string = course.get(1);
	    System.out.println(string);
	    
	    System.out.println(".......to print all value use foreach or forloop.........");
	    
	    System.out.println("........using for loop........");
	    for (int i = 0; i < course.size(); i++) {
	    	String string2 = course.get(i);
	    	System.out.println(string2);
			}
	    System.out.println(".....using foreach loop....");
	    
	    for (String X : course) {
			System.out.println(X);
		}
	    
	}

}
