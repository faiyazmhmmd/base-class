package com.OMRBranch.StepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.OMRBranch.pages.SelectHotelPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BookHotelStep {
	

	@When("User add the Guest Details {string},{string},{string},{string} and {string}")
	public void user_add_the_guest_details_and(String Select_Salutation, String first_name, String last_name, String Mobile_No, String Email) {
	    TC1_LoginStep.pom.getBookingHotelPage().addGuestDetails(Select_Salutation, first_name, last_name, Mobile_No, Email);
	}
	@When("User add the GST Details {string},{string} and {string}")
	public void user_add_the_gst_details_and(String Enter_Registration_No, String Enter_Company_Name, String Enter_Company_Address) {
	  TC1_LoginStep.pom.getBookingHotelPage().addGSTDetails(Enter_Registration_No, Enter_Company_Name, Enter_Company_Address);
	}
	@When("User add special request {string}")
	public void user_add_special_request(String Request) {
		TC1_LoginStep.pom.getBookingHotelPage().addSpecialReq(Request);
	   
	}
	@When("User enter payment details,procced with card type {string}")
	public void user_enter_payment_details_procced_with_card_type(String card_type, io.cucumber.datatable.DataTable dataTable) {
		
//	List<Map<String,String>> asMaps = dataTable.asMaps();
//	Map<String, String> data = asMaps.get(0);
//	String cardcom = data.get("Select_Card");
//	String cardnum = data.get("Card_No");
//	String cardname = data.get("Card_Name");
//	String maonth = data.get("Month");
//	String year = data.get("Year");
//	String cvv = data.get("CVV");
//	TC1_LoginStep.pom.getBookingHotelPage().addPaymentDetails(card_type, cardcom, cardnum, cardname, maonth, year, cvv);
	
	
		
		List<Map<String,String>> asMaps = dataTable.asMaps();
	    TC1_LoginStep.pom.getBookingHotelPage().addPaymentDetails(card_type,asMaps.get(0).get("Select_Card"),asMaps.get(0).get("Card_No"),asMaps.get(0).get("Card_Name"),asMaps.get(0).get("Month"),asMaps.get(0).get("Year"),asMaps.get(0).get("CVV"));
	}
	@Then("User should verify after hotel booking Success message {string} and save the order Id")
	public void user_should_verify_after_hotel_booking_success_message_and_save_the_order_id(String exp_getbookinconformsuccessmsg ) {
	String act_getbookinconformsuccessmsg = TC1_LoginStep.pom.getBookingConfirmationPage().getbookinconformsuccessmsg();
	System.out.println(act_getbookinconformsuccessmsg);
	boolean contains = act_getbookinconformsuccessmsg.contains(exp_getbookinconformsuccessmsg);
	Assert.assertTrue("verify after hotel booking Success message ", contains);
	String orderId = TC1_LoginStep.pom.getBookingConfirmationPage().getOrderId();
	System.out.println(orderId);
	
	}
	@Then("User Should verify that same selected Hotel is Booked or not")
	public void user_should_verify_that_same_selected_hotel_is_booked_or_not() {
		
		String bookHotelName = TC1_LoginStep.pom.getBookingConfirmationPage().getBookHotelName();
		String hotelName = SelectHotelPage.hotelName;
		boolean contains2 = hotelName.contains(bookHotelName);
		Assert.assertTrue("verify that same selected Hotel is Booked or not", contains2);
	   
	}
	

	@When("User without entering payment details and click Submit")
	public void user_without_entering_payment_details_and_click_submit() {
		TC1_LoginStep.pom.getBookingHotelPage().withoutAddPaymentDetails();
	    
	}
	@Then("User should verify after payment details Error message {string} ,{string},{string},{string},{string} and {string}")
	public void user_should_verify_after_payment_details_error_message_and(String exp_cardPaymentTypeErrorMsg, String exp_cardTypeErrorMsg, String exp_cardNuErrorMsg, String exp_cardNameErrorMsg, String exp_cardMonthErrorMsg, String exp_cardCVVErrorMsg) {
	   String act_cardPaymentTypeErrorMsg = TC1_LoginStep.pom.getBookingHotelPage().getCardPaymentTypeErrorMsg();
	   boolean contains = act_cardPaymentTypeErrorMsg.contains(exp_cardPaymentTypeErrorMsg);
	   Assert.assertTrue("", contains);
	   String act_cardTypeErrorMsg = TC1_LoginStep.pom.getBookingHotelPage().getCardTypeErrorMsg();
	   boolean contains2 = act_cardTypeErrorMsg.contains(exp_cardTypeErrorMsg);
	   Assert.assertTrue("", contains2);
	   String act_cardNuErrorMsg = TC1_LoginStep.pom.getBookingHotelPage().getCardNuErrorMsg();
	   boolean contains3 = act_cardNuErrorMsg.contains(exp_cardNuErrorMsg);
	   Assert.assertTrue("", contains3);
	   String act_cardNameErrorMsg = TC1_LoginStep.pom.getBookingHotelPage().getCardNameErrorMsg();
	   boolean contains4 = act_cardNameErrorMsg.contains(exp_cardNameErrorMsg);
	   Assert.assertTrue("", contains4);
	   String act_cardMonthErrorMsg = TC1_LoginStep.pom.getBookingHotelPage().getCardMonthErrorMsg();
	   boolean contains5 = act_cardMonthErrorMsg.contains(exp_cardMonthErrorMsg);
	   Assert.assertTrue("",contains5);
	   String act_cardCVVErrorMsg = TC1_LoginStep.pom.getBookingHotelPage().getCardCVVErrorMsg();
	   boolean contains6 = act_cardCVVErrorMsg.contains(exp_cardCVVErrorMsg);
	   Assert.assertTrue(contains6);
	   
	   
	}





}
