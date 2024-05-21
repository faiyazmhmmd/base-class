package org.Day3_Ex4_writer_om;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		File file=new File("D:\\maven\\maven work spsce\\API\\src\\test\\resources\\Day3_Exc4_write_OM .json");
		
		ObjectMapper mapper=new ObjectMapper();
		
		List<EmpDetail> a=new ArrayList<EmpDetail>();
		
		EmpDetail e1=new EmpDetail("faiyaz","java", "Madurai");
		EmpDetail e2=new EmpDetail("fara","python", "chennai");
		EmpDetail e3=new EmpDetail("mphan","java", "mumbai");
		EmpDetail e4=new EmpDetail("sam","java", "punai");
		EmpDetail e5=new EmpDetail("tamari","java", "cmbd");
		EmpDetail e6=new EmpDetail("ram","java", "salem");
		
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		a.add(e5);
		a.add(e6);
		
		Pojo p=new Pojo("bala", "bala@gamil",9566456117l,a);
		
		mapper.writeValue(file, p);
				
		
		
	}

}
