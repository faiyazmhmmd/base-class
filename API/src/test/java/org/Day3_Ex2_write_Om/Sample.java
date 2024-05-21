package org.Day3_Ex2_write_Om;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		File file=new File("D:\\maven\\maven work spsce\\API\\src\\test\\resources\\Day3_Exc2_write_om .json");
		
		ObjectMapper mapper=new ObjectMapper();
		
		Address a=new Address("SriRam Nagar","TN", 625017);
		Pojo p=new Pojo("Abu","Abu@gmail,com",9566456114l,true,a);
		
		mapper.writeValue(file, p);
		
	}

}
