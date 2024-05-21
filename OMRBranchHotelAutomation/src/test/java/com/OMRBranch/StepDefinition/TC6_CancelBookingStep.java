package com.OMRBranch.StepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC6_CancelBookingStep {
	

	@When("User Cancel the New OrderId")
	public void user_cancel_the_new_order_id() {
		TC1_LoginStep.pom.getMyBookingPage().cancelOrderId();
	   
	}
	@Then("User Should verify the after Cancel Success Message {string}")
	public void user_should_verify_the_after_cancel_success_message(String exp_updatOrCancelesuccessmsg) {
	    String act_updatOrCancelesuccessmsg = TC1_LoginStep.pom.getMyBookingPage().getUpdatOrCancelesuccessmsg();
	boolean contains = act_updatOrCancelesuccessmsg.contains(exp_updatOrCancelesuccessmsg);
	Assert.assertTrue("Should verify the after Cancel Success Message",contains);
	}
	

	@When("User Cancel the Exexting Orderid {string}")
	public void user_cancel_the_exexting_orderid(String string) {
		TC1_LoginStep.pom.getMyBookingPage().cancelOrderId();
	}

	

	@When("User Cancel the First Displayed OrderId")
	public void user_cancel_the_first_displayed_order_id() {
		TC1_LoginStep.pom.getMyBookingPage().cancelOrderId();
	}







}
