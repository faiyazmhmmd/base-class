package org.Data_provider;

import org.baseclass.base;
import org.suitle_level_execution.sample1;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exc1  extends base{
	@BeforeClass
	private void beforeclass() {
		browserLaunch("CHROME");
		enterApplnUrl("https://omrbranch.com/");
		maximizeWindow();
		implicitWait();
		
	}
	
	@Test(dataProvider="res")
	private void tc1(String username,String password) {
       sample1 s=new sample1();
       s.login(username, password);
	}
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
