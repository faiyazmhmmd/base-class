package org.soft_Assert;

import org.baseclass.base;
import org.checkerframework.checker.units.qual.s;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class sample extends base {
	
	@Test
	private void softAssert() {
		chromebrowser();
		enterApplnUrl("https://adactinhotelapp.com/");
		maximizeWindow();
		implicitWait();
		
		SoftAssert a=new SoftAssert();
		
		String url = driver.getCurrentUrl();
		boolean b = url.contains("Hotel");
		a.assertTrue(b,"verify ulr");
		
		//String title = driver.getTitle();
		System.out.println("done..");
  		
		a.assertNotEquals(getApplnTitle(),"Adactin.com - Hotel Reservation System ");
        
		System.out.println("done1..");
	    
		a.assertAll();
	
		System.out.println("done2....");
	
	}

}
