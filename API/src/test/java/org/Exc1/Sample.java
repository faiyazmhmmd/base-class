package org.Exc1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {

	public static void main(String[] args) throws IOException, ParseException  {

		FileReader fileReader=new FileReader("D:\\maven\\maven work spsce\\API\\src\\test\\resources\\DayOneExc1.json");
		
		JSONParser jasonParser=new JSONParser();
		Object parse = jasonParser.parse(fileReader);
//System.out.println(parse);--->it give all data in output to get specific key and it's value convert object to JSONObject
		
		JSONObject jsonObject=(JSONObject)parse;//-->class casting(convert super class to specific class(object-->super class))
	
		//	System.out.println(jsonObject);-->it give the all data in output
		
		//to get specific key Values we use get()--like map
		
		Object object = jsonObject.get("name");
		
		//System.out.println(object);
		
       //to conert object to string
		
      String s=(String) object;//--class casting(down casting)	
		
	System.out.println(s);	
		
	}

}
