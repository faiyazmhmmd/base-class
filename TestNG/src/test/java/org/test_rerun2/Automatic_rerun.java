package org.test_rerun2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Automatic_rerun {////we know the failed testcase
	
	@Test
	private void tc1() {

	}
	
	//testcase is  failed
	
	@Test(retryAnalyzer=Sample_failed.class )
	
	private void tc2() {
    Assert.assertTrue(false);
	}
	
	@Test
	private void tc3() {
    }
	
	//test case is failed
	
	@Test(retryAnalyzer=Sample_failed.class )
	
	private void tc4() {
		Assert.assertTrue(false);
	}
	
	@Test
	private void tc5() {
		Assert.assertTrue(true);
	}

}
