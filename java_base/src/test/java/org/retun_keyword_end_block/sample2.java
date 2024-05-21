package org.retun_keyword_end_block;

public class sample2 {
	// retun keyword end in block
	//single if block
	public int test(int empId) {
		if(empId==10) {
			return 100;
		}
		return 0;
		
	}
	public static void main(String[] args) { 
		sample2 a=new sample2();
		int t=a.test(10);
		 System.out.println(t);
	}

}
