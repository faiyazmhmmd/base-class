package org.retun_keyword_end_block;

public class sample3 {
	public int test3(int empid1) {
		if(empid1==10) {
			return 100;
			}
		if(empid1==20) {
			return 200;
			}
		if(empid1==30) {
			return 300;
		}
		return 0;
	}

	public static void main(String[] args) {
        sample3 a=new sample3();
        
        int t=a.test3(30);
        System.out.println(t);


	}

}
