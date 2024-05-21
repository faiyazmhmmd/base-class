package org.private_variable_access_in_diff_class;

public class employee2 {

	public static void main(String[] args) {

		Employee1 a=new Employee1(100,"faiyaz",9566456114l);
		
		Employee1 a1=new Employee1(200,"fara", 9942873427l);
		
		System.out.println(a.getId());
		System.out.println(a.getName());
		System.out.println(a.getPhoneNo());
		
		System.out.println(a1.getName());
		System.out.println(a1.getName());
		System.out.println(a1.getPhoneNo());
		
	}

}
