package org.parameter_option;

import org.baseclass.base;
import org.suitle_level_execution.sample1;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sample2 extends base{
	@BeforeClass
	private void beforeclass() {
		browserLaunch("CHROME");
		enterApplnUrl("https://omrbranch.com/");
		maximizeWindow();
		implicitWait();
		
	}
	
	@Parameters({"username","password"})
	@Test
	private void tc1(@Optional("fara@gmail.com")String username,String password) {
       sample1 s=new sample1();
       s.login(username, password);
	}

}
