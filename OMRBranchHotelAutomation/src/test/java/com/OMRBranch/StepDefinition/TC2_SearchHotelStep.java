package com.OMRBranch.StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.OMRBranch.BaseClass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelStep extends BaseClass {
	
	
	

	@When("User search Hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_hotel_and(String Select_State, String Select_City, String Select_room_type, String Check_in, String Check_out, String no_room, String on_of_adult, String no_of_child) {
	   
		TC1_LoginStep.pom.getSearchHotelPage().searchHotel(Select_State, Select_City, Select_room_type, Check_in, Check_out, no_room, on_of_adult, no_of_child);
	}
	@Then("User should verify after search Hotel success message {string}")
	public void user_should_verify_after_search_hotel_success_message(String exp_selectHotelSuccessMsg) {
	   
		String act_selectHotelSuccessMsg = TC1_LoginStep.pom.getSelectHotelPage().getSelectHotelSuccessMsg();
		boolean contains = act_selectHotelSuccessMsg.contains(exp_selectHotelSuccessMsg);
		Assert.assertTrue("verify after search Hotel success message", contains);
	}

	@When("User search Hotel {string},{string},{string},{string},{string} and {string}")
	public void user_search_hotel_and(String Select_State, String Select_City, String Check_in, String Check_out, String no_room, String on_of_adult) {
	    
		TC1_LoginStep.pom.getSearchHotelPage().searchHotalMandatoryField(Select_State, Select_City, Check_in, Check_in, no_room, on_of_adult);
	}

	
	@When("User click the Search button")
	public void user_click_the_search_button() {
		
		TC1_LoginStep.pom.getSearchHotelPage().searchHotelWithoutMandatoryField();
	    
	}
	@Then("User should verify after Search Hotel Error message {string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_after_search_hotel_error_message_and(String exp_stateNameErrorMsgText, String exp_cityNameErrorMsgText, String exp_checkInErrormsg, String exp_checkOutErrorMsg, String exp_getnoOfRoomErrorMsg , String exp_noAdultsErrorMsg ) {
	    
		
		String act_stateNameErrorMsgText = TC1_LoginStep.pom.getSearchHotelPage().getStateNameErrorMsgText();
		boolean contains = act_stateNameErrorMsgText.contains(exp_stateNameErrorMsgText);
		Assert.assertTrue("verify after search hotel error msg", contains);
		
		String act_cityNameErrorMsgText = TC1_LoginStep.pom.getSearchHotelPage().getCityNameErrorMsgText();
		boolean contains2 = act_cityNameErrorMsgText.contains(exp_cityNameErrorMsgText);
		Assert.assertTrue("verify after search hotel error msg", contains2);
		
		String act_checkInErrormsg = TC1_LoginStep.pom.getSearchHotelPage().getCheckInErrormsg();
		boolean contains3 = act_checkInErrormsg.contains(exp_checkInErrormsg);
		Assert.assertTrue("verify after search hotel error msg", contains3);
		
		String act_checkOutErrorMsg = TC1_LoginStep.pom.getSearchHotelPage().getCheckOutErrorMsg();
		boolean contains4 = act_checkOutErrorMsg.contains(exp_checkOutErrorMsg);
		Assert.assertTrue("verify after search hotel error msg", contains4);
		
		String act_getnoOfRoomErrorMsg = TC1_LoginStep.pom.getSearchHotelPage().getnoOfRoomErrorMsg();
		boolean contains5 = act_getnoOfRoomErrorMsg.contains(exp_getnoOfRoomErrorMsg);
		Assert.assertTrue("verify after search hotel error msg", contains5);
		
		String act_noAdultsErrorMsg = TC1_LoginStep.pom.getSearchHotelPage().getNoAdultsErrorMsg();
		boolean contains6 = act_noAdultsErrorMsg.contains(exp_noAdultsErrorMsg);
		Assert.assertTrue("verify after search hotel error msg", contains6);
		
	}

	@Then("User should verify all listed hotel room ends with Selected room type {string}")
	public void user_should_verify_all_listed_hotel_room_ends_with_selected_room_type(String Select_room_type) {
	   
		TC1_LoginStep.pom.getSelectHotelPage().verifyHotelNameEndsWithRoomType(Select_room_type);
	}

	@Then("User should verify the all Hotel room type displayed in header {string}")
	public void user_should_verify_the_all_hotel_room_type_displayed_in_header(String AllSelect_room_type) {
	   
		String act_verifyHotalTypeInHeader = TC1_LoginStep.pom.getSelectHotelPage().verifyHotalTypeInHeader();
	    boolean contains =act_verifyHotalTypeInHeader.contains(AllSelect_room_type);
	    Assert.assertTrue("verify the all hotel room type in displayed in header",contains);
	}
	

	@When("User Click the Price low to high in Sort By option")
	public void user_click_the_price_low_to_high_in_sort_by_option() {
		
		TC1_LoginStep.pom.getSelectHotelPage().clickPriceLowToHigh();
	   
	}
	@When("User Should verify the List Hotel room price in the order of low to high")
	public void user_should_verify_the_list_hotel_room_price_in_the_order_of_low_to_high() throws InterruptedException {
	   
		TC1_LoginStep.pom.getSelectHotelPage().verifyHotelPriceLowToHigh(); 
		
	}
	

	@When("User Click the Price  high to low in Sort By option")
	public void user_click_the_price_high_to_low_in_sort_by_option() {
		TC1_LoginStep.pom.getSelectHotelPage().clickPriceHightoLow();
	    
	}
	@When("User Should verify the List Hotel room price in the order of high to low")
	public void user_should_verify_the_list_hotel_room_price_in_the_order_of_high_to_low() throws InterruptedException {
	    TC1_LoginStep.pom.getSelectHotelPage().verifyHotelPriveHighToLow();
	}


	@When("User Click the Name Ascending")
	public void user_click_the_name_ascending() {
		TC1_LoginStep.pom.getSelectHotelPage().clickHotelNameAscending();
	    
	}
	@When("User Should verify the List Hotel Name in Ascending order")
	public void user_should_verify_the_list_hotel_name_in_ascending_order() throws InterruptedException {
	    TC1_LoginStep.pom.getSelectHotelPage().verifyHotelNameAscending();
	
	}
	

	@When("User Click the Name Descending")
	public void user_click_the_name_descending() {
		TC1_LoginStep.pom.getSelectHotelPage().clickHotelNameDescending();
	    
	}
	@When("User Should verify the List Hotel Name in Descending order")
	public void user_should_verify_the_list_hotel_name_in_descending_order() throws InterruptedException {
	   TC1_LoginStep.pom.getSelectHotelPage().verifyHotelNameDescending();
	}




	
















}
