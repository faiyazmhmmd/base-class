package com.api.StepDefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.api.baseclass.BaseClass;
import com.api.endPoints.Endpoint;
import com.api.pojo.address.CityList_input_pojo;
import com.api.pojo.address.CityList_output_pojo;
import com.api.pojo.address.Citylist;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TC3_CityListStep extends BaseClass {
	Response addRequestType;
	
	@Given("User add header for to get citylist")
	public void user_add_header_for_to_get_citylist() {
		List<Header> listheaders = new ArrayList<>();
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Content-Type", "application/json");
		listheaders.add(h1);
		listheaders.add(h2);
		Headers headers = new Headers(listheaders);
		addHeaders(headers);
	}
	
	@When("User add request body stateid for to get city list")
	public void user_add_request_body_stateid_for_to_get_city_list() {
		CityList_input_pojo citylist_input = new CityList_input_pojo(TC1_LoginStep.globalDatas.getStateidtext());
		addBody(citylist_input);
	}
	
	@When("User send {string} request for citylist endpoint")
	public void user_send_request_for_citylist_endpoint(String type) {
		addRequestType = addRequestType(type, Endpoint.CITYLIST);
		int respondCode = getRespondCode(addRequestType);
		TC1_LoginStep.globalDatas.setStatuscode(respondCode);
	}
	
	@Then("User Verify the citylist response message matches {string} and saved city ID")
	public void user_verify_the_citylist_response_message_matches_and_saved_city_id(String expCityName) {

		CityList_output_pojo a = addRequestType.as(CityList_output_pojo.class);
		ArrayList<Citylist> cityList = a.getData();
		for (Citylist eachcityList : cityList) {
			String name = eachcityList.getName();

			if (name.equals("Madurai")) {

				int cityidnum = eachcityList.getId();
				System.out.println(cityidnum);
				Assert.assertEquals("verify the city name",expCityName ,name);
			}}
		
	}



}
