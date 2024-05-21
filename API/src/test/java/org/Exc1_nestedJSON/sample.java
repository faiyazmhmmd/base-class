package org.Exc1_nestedJSON;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class sample {

	public static void main(String[] args) throws Exception {

		FileReader reader=new FileReader("D:\\maven\\maven work spsce\\API\\src\\test\\resources\\DayOne_nested_Jsonobject.Json");
		
		JSONParser jsonparser=new JSONParser();
		
		Object parser = jsonparser.parse(reader);
		
		JSONObject jsonobject=(JSONObject)parser;
		
		Object object = jsonobject.get("adress");
		
		
		JSONObject jsonobject2=(JSONObject)object;
		
		Object object2 = jsonobject2.get("stateName");
		
		System.out.println(object2);
		
				
		
		
		
	}

}
