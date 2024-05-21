package org.Data_provider;

import org.baseclass.base;
import org.suitle_level_execution.sample1;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class exx2_1 extends base{
	
	@BeforeClass
	private void beforeclass() {
		browserLaunch("CHROME");
		enterApplnUrl("https://omrbranch.com/");
		maximizeWindow();
		implicitWait();
		
	}


@Test(dataProvider="res",dataProviderClass=exx2.class)
private void tc1(String username,String password) {
   sample1 s=new sample1();
   s.login(username, password);
}
}
