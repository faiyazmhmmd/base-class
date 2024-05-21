package org.Day2_Ex4;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sampple {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
	
		File file=new File("D:\\maven\\maven work spsce\\API\\src\\test\\resources\\Object_mapping_exc4_empDetail.jso");
		
		ObjectMapper mapper=new ObjectMapper();
		
		Pojo V = mapper.readValue(file, Pojo.class);
		
		String name = V.getName();
		System.out.println(name);
		
		

	}

}
