package com.api.StepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Then;

public class CommanStep {
	
	@Then("User should verify the Status code is {int}")
	public void user_should_verify_the_status_code_is(int expect_statuscode) {
		
		int act_statuscode = TC1_LoginStep.globalDatas.getStatuscode();
		
		Assert.assertEquals("verify the status code",expect_statuscode ,act_statuscode);
	}
}
