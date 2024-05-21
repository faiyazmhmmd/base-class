package org.Test_rerrun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class manual_run {//we know the failed testcase
	@Test
	private void tc1() {

	}
	@Test
	private void tc2() {
Assert.assertTrue(false);
	}
	@Test
	private void tc3() {
		Assert.assertTrue(true);
	}
	@Test
	private void tc4() {
		Assert.assertTrue(false);
	}
	@Test
	private void tc5() {
		Assert.assertTrue(true);
	}
	

}
