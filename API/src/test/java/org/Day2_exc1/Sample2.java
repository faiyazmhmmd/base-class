package org.Day2_exc1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample2 {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader filereader=new FileReader("D:\\maven\\maven work spsce\\API\\src\\test\\resources\\JSONArray_nested.json");
		
		JSONParser jsonparser=new JSONParser();
		
		Object parse = jsonparser.parse(filereader);
		
		JSONObject jsonObject=(JSONObject) parse;
		
		Object object = jsonObject.get("empDetail");
		
		JSONArray jsonArray=(JSONArray) object;
		
		Object object2 = jsonArray.get(2);
		
		System.out.println(object2);
		
		System.out.println("-------all to be print-----");
		for (int i = 0; i < jsonArray.size(); i++) {
			Object object3 = jsonArray.get(i);
			//System.out.println(object3);
			
			JSONObject jsonObject2=(JSONObject) object3;
			
			Object fname= jsonObject2.get("firstName");
			System.out.println(fname);
			
			Object cos = jsonObject2.get("course");
			System.out.println(cos);
			
			
			Object fname2= jsonObject2.get("adress");
			System.out.println(fname2);
			
			
		}
		
		
	}

}
