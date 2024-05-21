package org.Day3_task1_write_OM;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		File file=new File("D:\\maven\\maven work spsce\\API\\src\\test\\resources\\Day3_Task1_write_OM .json");
		
		ObjectMapper mapper=new ObjectMapper();
		
		
		List<Datum> d=new ArrayList<Datum>();
		
		Datum a=new Datum(1, "AirIndia", "India", "58", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		Datum a1=new Datum(2, "AirIndia","kailasa", "55", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		Datum a2=new Datum(3, "AirSara","Oman","608","https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		Datum a3=new Datum(4, "AirIndia", "India", "20", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		Datum a4=new Datum(5, "Srilankan AriLines","SriLanka", "56", "https:\\/\\/en.wikipedia.org\\/wiki\\/Sri_Lanka");
		Datum a5=new Datum(6, "AirIndia.Raj", "India", "98", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		d.add(a);
		d.add(a1);
		d.add(a2);
		d.add(a3);
		d.add(a4);
		d.add(a5);
		
		Support s=new Support("https:\\/\\/omrbranch.com", "For Joining Automation Course, Please Contact-Velmurugan 9944152058");
		
		Pojo p=new Pojo(1,6,5846,975, d, s);
		
		mapper.writeValue(file,p);
		
		
	}

}
