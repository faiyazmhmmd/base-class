package org.Exc1;

import org.baseclass.base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class invocation_count extends base{
	@BeforeClass
	private void beforeclass() {
		browserLaunch("CHROME");
		enterApplnUrl("https://omrbranch.com/");
		maximizeWindow();
		implicitWait();
		}
	@AfterClass
	private void afterClass() {
		closeCurrentWindow();
	}
	@BeforeMethod
	private void beforemethod() {
    long timeMillis = System.currentTimeMillis();
    System.out.println(timeMillis);
	}
	@AfterMethod
	private void aftermethod() {
    long endtimeMillis = System.currentTimeMillis();
    System.out.println(endtimeMillis);
	}
	
	@Test
	private void login() {
		sample2 a=new sample2();
		a.login("faiyazmhmmd@gmail.com", "Madurai@123");
    }
	
	@Test(invocationCount=5)
	private void searchproduct() {
	sample3 a1=new sample3();
	a1.search("nuts");

	}
	


	
	
	

}
