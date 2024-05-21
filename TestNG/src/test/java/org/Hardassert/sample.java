package org.Hardassert;

import org.baseclass.base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sample extends base {
	@Test
	private void hardAssert() {

		chromebrowser();
		enterApplnUrl("https://adactinhotelapp.com/");
		maximizeWindow();
		implicitWait();
		Assert.assertTrue(driver.getCurrentUrl().contains("hotel"), "verify ulr");
		System.out.println("done...");

		// String title = driver.getTitle();

		Assert.assertEquals(getApplnTitle(), "Adactin.com - Hotel Reservation System");
		System.out.println("done...");

	}

}
