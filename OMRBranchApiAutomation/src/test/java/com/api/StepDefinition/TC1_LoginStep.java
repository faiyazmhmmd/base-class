package com.api.StepDefinition;

import java.io.FileNotFoundException;

import java.io.IOException;
import org.junit.Assert;
import com.api.baseclass.BaseClass;
import com.api.endPoints.Endpoint;
import com.api.globalData.GlobalData;
import com.api.pojo.login.Login_output_pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class TC1_LoginStep extends BaseClass {

	static GlobalData globalDatas = new GlobalData();

	Response requestType;

	@Given("user add header")
	public void user_add_header() {
		addHeader("accept", "application/json");

	}

	@When("User add basic Autheration for login")
	public void user_add_basic_autheration_for_login() throws FileNotFoundException, IOException {
		addBasicAuth(getPropertFileValue("username"), getPropertFileValue("password"));
	}

	@When("User Send {string} request for login endpoint")
	public void user_send_request_for_login_endpoint(String Type) {
		requestType = addRequestType(Type, Endpoint.LOGIN);
		int respondCode = getRespondCode(requestType);
		globalDatas.setStatuscode(respondCode);
	}

	@Then("User should Verify the login response body first_Name present as {string} and get the logtoken saved")
	public void user_should_verify_the_login_response_body_first_name_present_as_and_get_the_logtoken_saved(
			String expfirst_name) {

		Login_output_pojo a = requestType.as(Login_output_pojo.class);

		String actfirst_name = a.getData().getFirst_name();
		System.out.println(actfirst_name);
		Assert.assertEquals("verify first name of loginendpoint", expfirst_name, actfirst_name);
		
		String logtoken = a.getData().getLogtoken();
		TC1_LoginStep.globalDatas.setLogToken(logtoken);
		
	}

}
