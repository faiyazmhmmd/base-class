package org.Data_provider;

import org.testng.annotations.DataProvider;

public class exx2 {
	//dataprovider in different class
	@DataProvider(name="res")
	public  Object[][] datas() {
    Object[][] a=new Object[2][2];
    a[0][0]="bala@gmail.com";
    a[0][1]="bala@123";
    a[1][0]="mani@gamil.com";
    a[1][1]="mani@123";
	return a;
	}

}
