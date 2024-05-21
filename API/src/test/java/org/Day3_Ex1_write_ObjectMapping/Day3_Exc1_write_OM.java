package org.Day3_Ex1_write_ObjectMapping;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Day3_Exc1_write_OM {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File file=new File("D:\\maven\\maven work spsce\\API\\src\\test\\resources\\Day3_Exc1_write_OM .json");
		
		ObjectMapper mapper=new ObjectMapper();
		
		Pojo p=new Pojo("abu","abu@gmail.com",9566456114l);
		
		mapper.writeValue(file, p);
		
		
		
	}

}
