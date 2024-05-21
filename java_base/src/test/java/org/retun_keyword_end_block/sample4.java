package org.retun_keyword_end_block;

public class sample4 {
	public int test4(int empid1) {
	
	//multiple if with single return
		
		int res=0;
		
		if(empid1==10) {
		    res=100;
			}
		if(empid1==20) {
		   res=200;		
		}
		if(empid1==30) {
	        res=300;	
		}
		return res;
	}

	public static void main(String[] args) {
		sample4 a=new sample4();
		int te=a.test4(10);
		System.out.println(te);

	}

}
