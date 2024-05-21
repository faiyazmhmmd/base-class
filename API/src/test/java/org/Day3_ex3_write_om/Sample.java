package org.Day3_ex3_write_om;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

File file=new File("D:\\maven\\maven work spsce\\API\\src\\test\\resources\\Day3_Exc3_write_OM .json");

ObjectMapper mapper=new ObjectMapper();

ArrayList<String> c=new ArrayList<String>();
c.add("java");
c.add("Sql");
c.add("API");
c.add("appium");

Pojo p=new Pojo("faiyaz","faiyaz@gmail", 9566456114l,c);

mapper.writeValue(file, p);

		
		
		
		
	}

}
