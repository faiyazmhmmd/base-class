package org.Pass_The_Parameter_To_A_Method;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class sample {
	/*1.normal method:
	 * public void methodname(inputs){
	 * }
	 * 
	 * 2.pass datatype parameter in method:
	 * public void methodname(datatype variablename){
	 * }
	 * 
	 * 3.psaa class parameter in method:
	 * public void mathodname(classname objname){
	 * }
	 * 
	 * 4.pass interface parameter in method:
	 * public void methodname(interface referncename){
	 * }
	 */
	private void m() {
		int a;
		a=10;
		System.out.println(a);
	}

	private void m1(int a) {
		System.out.println(a);
	}
	
	private void m2(int a,int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	private void m3(ArrayList<Integer>i) {
	}
	
	private void m4(Map<String, String>m) {
	}
	

	public static void main(String[] args) {
	
		sample a=new sample();
		
		a.m();
		
		a.m1(100);
		
		a.m2(200,300);
		
		ArrayList<Integer>i=new ArrayList<Integer>();
		i.add(10);
		i.add(10);
		i.add(10);
		i.add(10);
		i.add(10);
       System.out.println(i);
		a.m3(i);
		
		Map<String, String>m=new LinkedHashMap<String, String>();
		
		m.put("name", "faiyaz");
		m.put("email", "faiyaz@gmail.com");
		m.put("course", "java");
		System.out.println(m);
		a.m4(m);
		
		

	}

}
