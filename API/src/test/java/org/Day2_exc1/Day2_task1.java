package org.Day2_exc1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Day2_task1 {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader failreader=new FileReader("D:\\maven\\maven work spsce\\API\\src\\test\\resources\\JSONArray_task.json");
		
		JSONParser jsonParser=new JSONParser();
		
		Object parse = jsonParser.parse(failreader);
		
		JSONObject jsonObject=(JSONObject) parse;
		
		Object page= jsonObject.get("page");
		System.out.println(page);
		
		Object per = jsonObject.get("per_page");
		System.out.println(per);
		
		Object tot = jsonObject.get("total");
		System.out.println(tot);
		
		Object tot_pag = jsonObject.get("total_pages");
		System.out.println(tot_pag);
		
		Object data = jsonObject.get("data");
		
		JSONArray jsonArray=(JSONArray) data;
		
		for (int i = 0; i < jsonArray.size(); i++) {
			
			Object array = jsonArray.get(i);
			
			JSONObject jsonObject2=(JSONObject) array;
			
			Object id = jsonObject2.get("id");
			System.out.println(id);
			
			Object flightname = jsonObject2.get("flightName");
			System.out.println(flightname);
			
			Object country = jsonObject2.get("Country");
			System.out.println(country);
			
			Object dest = jsonObject2.get("Destinations");
			System.out.println(dest);
			
			Object url = jsonObject2.get("URL");
			System.out.println(url);
			
		}
		
	Object support = jsonObject.get("support");
	
	JSONObject jsonObject2=(JSONObject) support;
	
	Object url = jsonObject2.get("url");
	System.out.println(url);
	
	Object text = jsonObject2.get("text");
	System.out.println(text);
		
		
	}
	
}
