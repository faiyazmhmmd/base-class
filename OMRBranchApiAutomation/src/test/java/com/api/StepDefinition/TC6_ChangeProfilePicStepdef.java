package com.api.StepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.api.baseclass.BaseClass;
import com.api.endPoints.Endpoint;
import com.api.pojo.ChangeProfilPic.Changeprofile_output_pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TC6_ChangeProfilePicStepdef extends BaseClass {
	
	Response addRequestType;
	
	@Given("User add header for Change ProfilePic endpoints")
	public void user_add_header_for_change_profile_pic_endpoints() {
		List<Header> listHeaders = new ArrayList<>();
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + TC1_LoginStep.globalDatas.getLogToken());
		Header h3 = new Header("Content-Type", "multipart/form-data");
		listHeaders.add(h1);
		listHeaders.add(h2);
		listHeaders.add(h3);
		Headers headers = new Headers(listHeaders);
		addHeaders(headers);
}

	@When("User add Form Data and pic location for Change ProfilePic")
	public void user_add_form_data_and_pic_location_for_change_profile_pic() {
	
		addFormData("profile_picture",new File("D:\\maven\\maven work spsce\\omrBranchApiAutomation\\profile\\java-4-logo-png-transparent.png"));
	}
	
	@When("User send {string} request for Change ProfilePic endpoint")
	public void user_send_request_for_change_profile_pic_endpoint(String type) {
		
		addRequestType = addRequestType(type, Endpoint.CHANGEPROFILEPIC);
		int respondCode = getRespondCode(addRequestType);
		TC1_LoginStep.globalDatas.setStatuscode(respondCode);

	}
	
	@Then("User should Verify the Change ProfilePic response body message present as {string}")
	public void user_should_verify_the_change_profile_pic_response_body_message_present_as(String Exp_changeprofile_message) {
		
		Changeprofile_output_pojo a = addRequestType.as(Changeprofile_output_pojo.class);
		String act_message = a.getMessage();
		Assert.assertEquals("verify the change profile message",Exp_changeprofile_message,act_message);

	}




}
