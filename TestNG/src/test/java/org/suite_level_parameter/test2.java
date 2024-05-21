package org.suite_level_parameter;

import org.baseclass.base;
import org.suitle_level_execution.sample1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;



public class test2 extends base{
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
	@Parameters({"username","password"})
	@Test
	private void tc1(String username,String password) {
       sample1 s=new sample1();
       s.login(username, password);
	}

}
