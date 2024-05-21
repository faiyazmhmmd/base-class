package org.retun_keyword_end_method;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class sample1 {
/*must use the retun keyword end of the method:
 *
 *1) public DataType m(){
 *     return value;
 *   }
 *2) public ClassName m(){
 *   return objname;
 *   }
 *3) public interface m(){
 *   return reffname;
 *   }   
 * 
 */
	//data type
	public int m1() {
		
		return 100;
		}
	//classname
	public ArrayList<Integer>m2(){
		
		ArrayList<Integer>i=new ArrayList<Integer>();
		i.add(100);
		i.add(200);
		i.add(300);
		
		return i;
		}
	//interfacename
	public Map<String,String>m3(){
		
		Map<String, String>m=new LinkedHashMap<String, String>();
		m.put("name", "faiyaz");
		m.put("email","faiyaz@gmail.com");
		m.put("phone", "95662");
		
		
		return m;
		
	}
	public static void main(String[] args) {
		
		sample1 a=new sample1();
		
		int m1=a.m1();
		System.out.println(m1);
		
		ArrayList<Integer>m2=a.m2();
		System.out.println(m2);
		
		Map<String, String>m3=a.m3();
		System.out.println(m3);

	}

}
