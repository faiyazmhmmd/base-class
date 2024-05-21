package org.private_variable_access_in_diff_class;

public class sample1 {

	public static void main(String[] args) {

		sample a=new sample();
		
		a.setId(100);
		a.setName("faiyaz mohammed");
		a.setPhoneNo(956646117);
		
		sample a1=new sample();
		
		a1.setId(200);
		a1.setName("ram");
		a1.setPhoneNo(256646117);
		
		System.out.println(a.getId());
		System.out.println(a.getName());
		System.out.println(a.getPhoneNo());
		
		System.out.println(a1.getName());
		System.out.println(a1.getId());
		System.out.println(a1.getPhoneNo());
		
		
	}

}
