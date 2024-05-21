package com.api.StepDefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.api.baseclass.BaseClass;
import com.api.endPoints.Endpoint;
import com.api.pojo.address.DeleteAddress_input_pojo;
import com.api.pojo.address.DeleteAddress_output_pojo;
import com.api.pojo.address.addAddress_input_pojo;
import com.api.pojo.address.addAddress_output_pojo;
import com.api.pojo.address.getAddress_output_pojo;
import com.api.pojo.address.updateAddress_input_pojo;
import com.api.pojo.address.updateAddress_output_pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TC4_AddressStep extends BaseClass {

	Response addRequestType;

	@Given("User add header and bearer authorization for accesing adddress endpoints")
	public void user_add_header_and_bearer_authorization_for_accesing_adddress_endpoints() {
		List<Header> listHeaders = new ArrayList<>();
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + TC1_LoginStep.globalDatas.getLogToken());
		Header h3 = new Header("Content-Type", "application/json");
		listHeaders.add(h1);
		listHeaders.add(h2);
		listHeaders.add(h3);
		Headers headers = new Headers(listHeaders);
		addHeaders(headers);
	}

	@When("User add request body for addNewAddress {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_add_request_body_for_add_new_address(String first_name, String last_name, String mobile,
			String apartment, String state, String city, String country, String zipcode, String address,
			String address_type) {
		addAddress_input_pojo addAdress_input = new addAddress_input_pojo(first_name, last_name, mobile, apartment,
				TC1_LoginStep.globalDatas.getStateidNum(), TC1_LoginStep.globalDatas.getCityidNum(),
				Integer.parseInt(country), zipcode, address, address_type);
		addBody(addAdress_input);
	}

	@When("User send {string} request for adduseraddress endpoint")
	public void user_send_request_for_adduseraddress_endpoint(String type) {

		addRequestType = addRequestType(type, Endpoint.ADDUSERADDRESS);
		int respondCode = getRespondCode(addRequestType);
		TC1_LoginStep.globalDatas.setStatuscode(respondCode);
	}

	@Then("User should verify adduseraddress response message matches {string}")
	public void user_should_verify_adduseraddress_response_message_matches(String ExpAddAdressmessage) {

		addAddress_output_pojo output_address = addRequestType.as(addAddress_output_pojo.class);
		String act_message = output_address.getMessage();
		Assert.assertEquals("verify the add adress message success ", ExpAddAdressmessage, act_message);
		int address_id = output_address.getAddress_id();
		TC1_LoginStep.globalDatas.setAddress_id(address_id);
		String address_id_text = String.valueOf(address_id);
		TC1_LoginStep.globalDatas.setAddress_id_text(address_id_text);
	}

	@Given("User add header and bearer authorization for accesing updateadddress endpoints")
	public void user_add_header_and_bearer_authorization_for_accesing_updateadddress_endpoints() {

		List<Header> listHeaders = new ArrayList<>();
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + TC1_LoginStep.globalDatas.getLogToken());
		Header h3 = new Header("Content-Type", "application/json");
		listHeaders.add(h1);
		listHeaders.add(h2);
		listHeaders.add(h3);
		Headers headers = new Headers(listHeaders);
		addHeaders(headers);
	}

	@When("User add request body to UpdateNewAddress {string} {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_add_request_body_to_update_new_address(String address_id, String first_name, String last_name,
			String mobile, String apartment, String state, String city, String country, String zipcode, String address,
			String address_type) {

		updateAddress_input_pojo input_updateadd = new updateAddress_input_pojo(
				TC1_LoginStep.globalDatas.getAddress_id_text(), first_name, last_name, mobile, apartment,
				TC1_LoginStep.globalDatas.getStateidNum(), TC1_LoginStep.globalDatas.getCityidNum(),
				Integer.parseInt(country), zipcode, address, address_type);
		addBody(input_updateadd);
	}

	@When("User send {string} request for update AddUserAddress endpoint")
	public void user_send_request_for_update_add_user_address_endpoint(String type) {

		addRequestType = addRequestType(type, Endpoint.UPDATEADDRESS);
		int respondCode = getRespondCode(addRequestType);
		TC1_LoginStep.globalDatas.setStatuscode(respondCode);
	}

	@Then("User should verify updateaddress response message matches {string}")
	public void user_should_verify_updateaddress_response_message_matches(String ExpupdateAdressmessage) {

		updateAddress_output_pojo update_output = addRequestType.as(updateAddress_output_pojo.class);
		String act_message = update_output.getMessage();
		Assert.assertEquals("verify the update address success mes", ExpupdateAdressmessage, act_message);

	}

	@Given("User add headers and bearer authorization for accesing getadddress endpoints")
	public void user_add_headers_and_bearer_authorization_for_accesing_getadddress_endpoints() {
		List<Header> listHeaders = new ArrayList<>();
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " +TC1_LoginStep.globalDatas.getLogToken());
		listHeaders.add(h1);
		listHeaders.add(h2);
		Headers headers = new Headers(listHeaders);
		addHeaders(headers);
	}
	@When("User send {string} request for GetUserAddress endpoint")
	public void user_send_request_for_get_user_address_endpoint(String type) {
		addRequestType = addRequestType(type,Endpoint.GETADDRESS);
		int respondCode = getRespondCode(addRequestType);
		TC1_LoginStep.globalDatas.setStatuscode(respondCode);
	}
	@Then("User should verify getuseraddress response message matches {string}")
	public void user_should_verify_getuseraddress_response_message_matches(String Exp_getAdressmessage) {
		
		getAddress_output_pojo getAddress_output = addRequestType.as(getAddress_output_pojo.class);
		String act_message = getAddress_output.getMessage();
		Assert.assertEquals("verify the get address sucess message",Exp_getAdressmessage,act_message );
		
	}

	@Given("User add headers and bearer authorization for accesing deleteadddress endpoints")
	public void user_add_headers_and_bearer_authorization_for_accesing_deleteadddress_endpoints() {
		
		List<Header> listHeaders = new ArrayList<>();
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + TC1_LoginStep.globalDatas.getLogToken());
		Header h3 = new Header("Content-Type", "application/json");
		listHeaders.add(h1);
		listHeaders.add(h2);
		listHeaders.add(h3);
		Headers headers = new Headers(listHeaders);
		addHeaders(headers);

	}
	@When("User add request body for address ID")
	public void user_add_request_body_for_address_id() {
		
		DeleteAddress_input_pojo deleadd_input = new DeleteAddress_input_pojo(TC1_LoginStep.globalDatas.getAddress_id_text());
		addBody(deleadd_input);
	}
	@When("User send {string} request for DeleteAddress endpoint")
	public void user_send_request_for_delete_address_endpoint(String type) {
		
		addRequestType = addRequestType(type,Endpoint.DELETEADDRESS);
		int respondCode = getRespondCode(addRequestType);
		TC1_LoginStep.globalDatas.setStatuscode(respondCode);
	}
	@Then("User should verify DeleteAddress response message matches {string}")
	public void user_should_verify_delete_address_response_message_matches(String Exp_DeletAdressmessage) {
		
		 DeleteAddress_output_pojo Delet_output = addRequestType.as(DeleteAddress_output_pojo.class);
		String act_message = Delet_output.getMessage();
		Assert.assertEquals("Verify the Delete address success message",Exp_DeletAdressmessage,act_message);
	}

}
