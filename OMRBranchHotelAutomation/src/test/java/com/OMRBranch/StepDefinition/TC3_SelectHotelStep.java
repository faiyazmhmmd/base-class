package com.OMRBranch.StepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotelStep {
	public static String firstHotelName; 

	@When("User save the First Hotel Name and First Hotel Price")
	public void user_save_the_first_hotel_name_and_first_hotel_price() {
		String firstHotelName = TC1_LoginStep.pom.getSelectHotelPage().getFirstHotelName();
		System.out.println(firstHotelName);
	   String firstHotelPrice = TC1_LoginStep.pom.getSelectHotelPage().getFirstHotelPrice();
	   System.out.println(firstHotelPrice);
	}
	@When("User Select the First Hotel")
	public void user_select_the_first_hotel() {
		TC1_LoginStep.pom.getSelectHotelPage().clickContinue();
	    
	}
	@When("User accept the Alert")
	public void user_accept_the_alert() {
		TC1_LoginStep.pom.getSelectHotelPage().clickAlertAccept();
	    
	}
	@Then("User should verify the after select Hotel success message {string}")
	public void user_should_verify_the_after_select_hotel_success_message(String Exp_bookHotelSuccessmsg) {
		String Act_bookHotelSuccessmsg = TC1_LoginStep.pom.getBookingHotelPage().getBookHotelSuccessmsg();
		boolean contains = Act_bookHotelSuccessmsg.contains(Exp_bookHotelSuccessmsg);
		Assert.assertTrue("verify the after select Hotel success message",contains);
	    
	}
    @When("User Cancel the Alert")
	public void user_cancel_the_alert() {
    	TC1_LoginStep.pom.getSelectHotelPage().clickAlertDismiss();
	}
	@Then("User Should Verify after cancel alert it is in the same page message {string}")
	public void user_should_verify_after_cancel_alert_it_is_in_the_same_page_message(String exp_selectHotelSuccessMsg) {
	    String act_selectHotelSuccessMsg = TC1_LoginStep.pom.getSelectHotelPage().getSelectHotelSuccessMsg();
	    boolean contains = act_selectHotelSuccessMsg.contains(exp_selectHotelSuccessMsg);
	    Assert.assertTrue("erify after cancel alert  it is in the same page message", contains);
	}






}
