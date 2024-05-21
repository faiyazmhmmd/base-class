package org.Day2_exc1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class sample {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		
    FileReader failreader=new FileReader("D:\\maven\\maven work spsce\\API\\src\\test\\resources\\JSONArray.json");
	
   JSONParser jsonparser=new JSONParser();
  
   Object parse = jsonparser.parse(failreader);
    
   JSONObject jsonobject=(JSONObject) parse;
   
   Object object = jsonobject.get("course");
   
   System.out.println(object);
   
   JSONArray jsonarray=(JSONArray) object;
    
   Object object2 = jsonarray.get(2);
   System.out.println(object2);
   
   System.out.println("to print all one by one");
   
   for (int i = 0; i < jsonarray.size(); i++) {
	   
	   Object object3 = jsonarray.get(i);
	   System.out.println(object3);
	
}
   
	}

}
