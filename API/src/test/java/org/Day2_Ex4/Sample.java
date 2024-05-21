package org.Day2_Ex4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		File file=new File("D:\\maven\\maven work spsce\\API\\src\\test\\resources\\Object_mapping_exc4_empDetail.json");
		
		ObjectMapper mapper=new ObjectMapper();
		
		Pojo r = mapper.readValue(file,Pojo.class);
		
		String name = r.getName();
		String email = r.getEmail();
		long phoneNo = r.getPhoneNo();
	    Boolean payment = r.getPayment();
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(phoneNo);
		
		
		
		
//		ObjectMapper mapper=new ObjectMapper();
//		
//		Pojo readValue = mapper.readValue(file, Pojo.class);
//		
//		String name = readValue.getName();
//		String email = readValue.getEmail();
//		long phoneN0 = readValue.getPhoneN0();
//		
//		System.out.println(name);
//		System.out.println(email);
//		System.out.println(phoneN0);
//		
//		System.out.println("........empDetail........");
//		
////		ArrayList<EmpDetail> empDetail = readValue.getEmpDetail();
////		System.out.println(empDetail);
//		
		
		
	}

}
