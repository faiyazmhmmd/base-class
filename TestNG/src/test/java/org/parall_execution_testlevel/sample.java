package org.parall_execution_testlevel;

import org.baseclass.base;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sample extends base{
	
	
	@Parameters("browsername")
	@Test
	
	private void test1(String browsername) {

 
	switch (browsername) {
	case "chrome":
		System.out.println("chrome");
		chromebrowser();
		
		
		break;
	
	case "edge":
		System.out.println("edge");
		edgebrowser();
		
	    break;
	
	case "firefox":
		System.out.println("firefox");
		firefoxbrowser();
		
		break;
		

	default:
		break;
	}
	maximizeWindow();
	enterApplnUrl("https://omrbranch.com/");
	}
	
	

}
