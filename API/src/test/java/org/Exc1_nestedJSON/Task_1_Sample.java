package org.Exc1_nestedJSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task_1_Sample {

	public static void main(String[] args) throws IOException, ParseException {
   
		FileReader fileReader=new FileReader("D:\\maven\\maven work spsce\\API\\src\\test\\resources\\dayOne.json");
		
		JSONParser jsonparser=new JSONParser();
		
		Object parse = jsonparser.parse(fileReader);
		
		JSONObject jsonobject=(JSONObject)parse;
		
		Object object = jsonobject.get("data");
		
		JSONObject jsonObject2=(JSONObject)object;
		
		Object id= jsonObject2.get("id");
		System.out.println(id);
		
		Object flightname = jsonObject2.get("flightName");
		System.out.println(flightname);
		
		Object country = jsonObject2.get("Country");
		System.out.println(country);
		
		Object dest = jsonObject2.get("Destinations");
		System.out.println(dest);
		
		Object ulr = jsonObject2.get("URL");
		System.out.println(ulr);
		
		Object date = jsonObject2.get("Created_Date");
		System.out.println(date);
		
		Object update = jsonObject2.get("Updated_Date");
		System.out.println(update);
		
		Object object2 = jsonobject.get("support");
		
		JSONObject jsonObject3=(JSONObject)object2;
		
		Object url1 = jsonObject3.get("url");
		System.out.println(url1);
		
		Object text = jsonObject3.get("text");
		System.out.println(text);
		
		
		
		
		
	}

}
