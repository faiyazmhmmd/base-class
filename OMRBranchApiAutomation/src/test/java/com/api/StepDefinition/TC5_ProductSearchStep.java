package com.api.StepDefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.api.baseclass.BaseClass;
import com.api.endPoints.Endpoint;
import com.api.pojo.products.Search_input_pojo;
import com.api.pojo.products.search_output_pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TC5_ProductSearchStep extends BaseClass {

	Response addRequestType;

	@Given("User add header for product search adddress endpoints")
	public void user_add_header_for_product_search_adddress_endpoints() {
		List<Header> listHeaders = new ArrayList<>();
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Content-Type", "application/json");
		listHeaders.add(h1);
		listHeaders.add(h2);
		Headers headers = new Headers(listHeaders);
		addHeaders(headers);


	}
	@When("User add request body for product search {string}")
	public void user_add_request_body_for_product_search(String product_name) {
		Search_input_pojo search_input=new Search_input_pojo(product_name);
		addBody(search_input);

	}
	@When("User send {string} request for product search endpoint")
	public void user_send_request_for_product_search_endpoint(String type) {
		addRequestType = addRequestType(type, Endpoint.PRODUCTSEARCH);
		 int respondCode = getRespondCode(addRequestType);
		 TC1_LoginStep.globalDatas.setStatuscode(respondCode);


	}
	@Then("User should Verify the product search response body message present as {string}")
	public void user_should_verify_the_product_search_response_body_message_present_as(String Exp_searchmessage) {
		
		search_output_pojo a = addRequestType.as(search_output_pojo.class);
		 String act_message = a.getMessage();
		 Assert.assertEquals("verify the Search message ", Exp_searchmessage,act_message);


	}




}
