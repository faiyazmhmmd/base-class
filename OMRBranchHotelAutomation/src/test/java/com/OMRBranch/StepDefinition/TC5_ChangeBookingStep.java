	package com.OMRBranch.StepDefinition;

import java.awt.AWTException;

import org.junit.Assert;

import com.OMRBranch.pages.BookingConfirmationPage;
import com.OMRBranch.pages.SelectHotelPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_ChangeBookingStep {
	
	@When("User navigate into My Booking Page")
	public void user_navigate_into_my_booking_page() throws InterruptedException {
		TC1_LoginStep.pom.getBookingConfirmationPage().navigate_mybooking();
	   
	}
	@Then("User should verify after navigate My Booking Success Message {string}")
	public void user_should_verify_after_navigate_my_booking_success_message(String exp_bookHotelSuccessmsg) {
		
		String act_bookHotelSuccessmsg = TC1_LoginStep.pom.getMyBookingPage().getBookingsuccessmsg();
		System.out.println(act_bookHotelSuccessmsg);
	   boolean contains = act_bookHotelSuccessmsg.contains(exp_bookHotelSuccessmsg);
	   Assert.assertTrue("verify after navigate My Booking Success Message", contains);
	}
	@When("User Search OrderId")
	public void user_search_order_id() throws AWTException {
		TC1_LoginStep.pom.getMyBookingPage().searchOrderId();
	  
	}
	@Then("User Should verify the same Booked hotel Name is present or not")
	public void user_should_verify_the_same_booked_hotel_name_is_present_or_not() {
		String act_myBookingHotelName = TC1_LoginStep.pom.getMyBookingPage().getMyBookingHotelName();
	   String hotelName = SelectHotelPage.hotelName;
	   boolean contains = hotelName.contains(act_myBookingHotelName);
	   Assert.assertTrue("verify the same Booked hotel Name is present or not", contains);
	}
	@Then("User Should verify the same Booked hotel OrderId is present or not")
	public void user_should_verify_the_same_booked_hotel_order_id_is_present_or_not() {
	  
		String act_myBookingHotelOrderid = TC1_LoginStep.pom.getMyBookingPage().getMyBookingHotelOrderid();
		String orderId = BookingConfirmationPage.OrderId;
		boolean contains = orderId.contains(act_myBookingHotelOrderid);
		Assert.assertTrue("verify the same Booked hotel OrderId is present or not", contains);
	}
	@Then("User Should verify the same Booked hotel Prise is present or not")
	public void user_should_verify_the_same_booked_hotel_prise_is_present_or_not() {
	   
		String act_myBookingHotelPrice = TC1_LoginStep.pom.getMyBookingPage().getMyBookingHotelPrice();
		System.out.println(act_myBookingHotelPrice);
		String hotelprice = SelectHotelPage.hotelprice;
		boolean contains = hotelprice.contains(act_myBookingHotelPrice);
		Assert.assertTrue("verify the same Booked hotel Prise is present or not", contains);
	}
	@When("User Edit the Check-in Date {string}")
	public void user_edit_the_check_in_date(String ModifyDate) {
	    TC1_LoginStep.pom.getMyBookingPage().modifyChickinDate();
	}
	@Then("User Should verify the after modifiyed Check-in Date Success Message {string}")
	public void user_should_verify_the_after_modifiyed_check_in_date_success_message(String exp_getupdatesuccessmsg) {
	   String act_getupdatesuccessmsg = TC1_LoginStep.pom.getMyBookingPage().getUpdatOrCancelesuccessmsg();
	   boolean contains = act_getupdatesuccessmsg.contains(exp_getupdatesuccessmsg);
	   Assert.assertTrue("verify the after modifiyed Check-in Date Success Message", contains);
	}
	
	@When("User Search OrderId {string}")
	public void user_search_order_id(String OrderId) throws AWTException {
		TC1_LoginStep.pom.getMyBookingPage().searchExistingOrderId(OrderId);
	  
	}

	@When("User Modify the Check-In Date for the First Displayed OrderId {string}")
	public void user_modify_the_check_in_date_for_the_first_displayed_order_id(String string) {
		 TC1_LoginStep.pom.getMyBookingPage().modifyChickinDate();
	}








}
