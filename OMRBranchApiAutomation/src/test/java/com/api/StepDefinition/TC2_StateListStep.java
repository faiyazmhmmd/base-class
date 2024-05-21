package com.api.StepDefinition;

import java.util.ArrayList;

import org.junit.Assert;

import com.api.baseclass.BaseClass;
import com.api.endPoints.Endpoint;
import com.api.pojo.address.StateList_output_pojo;
import com.api.pojo.address.Statelist;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class TC2_StateListStep extends BaseClass {
	
	Response addRequestType;

	@Given("User add header for the statelist")
	public void user_add_header_for_the_statelist() {
	
		addHeader("accept", "application/json");
	}
	
	@When("User send {string} request for statelist endpoint")
	public void user_send_request_for_statelist_endpoint(String type) {
		addRequestType = addRequestType(type, Endpoint.STATELIST);
		int act_statuscode = getRespondCode(addRequestType);
		TC1_LoginStep.globalDatas.setStatuscode(act_statuscode);
	}
	
	@Then("User should verify the statelist response messgae matches {string} and saved state ID")
	public void user_should_verify_the_statelist_response_messgae_matches_and_saved_state_id(String expstatenum) {
		
		StateList_output_pojo a = addRequestType.as(StateList_output_pojo.class);
		ArrayList<Statelist> data = a.getData();
		for (Statelist eachstateList : data) {
			String each_state_name = eachstateList.getName();
			if (each_state_name.equals("Tamil Nadu")) {
			int	stateidnum = eachstateList.getId();
			TC1_LoginStep.globalDatas.setStateidNum(stateidnum);
			System.out.println(stateidnum);
				String Stateid = String.valueOf(stateidnum);
            TC1_LoginStep.globalDatas.setStateidtext(Stateid);
            
            Assert.assertEquals("verify the State name",expstatenum,each_state_name);
            break;
	   
	}
		}
		}
}






