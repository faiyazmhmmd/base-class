package org.suitle_level_execution;

import org.baseclass.base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test4 extends base {
	@BeforeClass
	private void beforeclass() {
		browserLaunch("CHROME");
		enterApplnUrl("https://omrbranch.com/");
		maximizeWindow();
		implicitWait();
		
	}
	@BeforeMethod
	private void beforemethod() {
		long timeMillis = System.currentTimeMillis();
	    System.out.println(timeMillis);
	}
	@AfterClass
	private void afterclass() {
        closeCurrentWindow();
	}
	@AfterMethod
	private void aftermethod() {
		long endtimeMillis = System.currentTimeMillis();
	    System.out.println(endtimeMillis);
	}
	@Test
	private void tc1() {
       sample1 s=new sample1();
       s.login("john@gmail.com","john@123" );
	}
	

}
