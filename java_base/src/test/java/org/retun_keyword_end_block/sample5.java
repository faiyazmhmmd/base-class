package org.retun_keyword_end_block;

public class sample5 {
	
	public Object a (int empId) {
		
		if(empId==10) {
			return 100;
		}
		if(empId==20) {
			return true;
		}
		if (empId==30) {
			return"faiyaz";
		}
		if(empId==40) {
			return 9566456443l;
		}
		return 0;
	}

	public static void main(String[] args) {
		sample5 i=new sample5();
		
		Object c=i.a(40);
		System.out.println(c);
		

	}

}
