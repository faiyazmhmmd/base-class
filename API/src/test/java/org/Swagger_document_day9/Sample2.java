package org.Swagger_document_day9;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Sample2 extends BaseClass {
	@Test(priority = 1)
	private void GetStateList() {
		addHeader("accept", "application/json");
		Response response2 = addRequestType("GET", "https://omrbranch.com/api/stateList");
		int respondCode = getRespondCode(response2);
		Assert.assertEquals(respondCode, 200, "verify the response code for State List");
		StateList_output_pojo b = response.as(StateList_output_pojo.class);
		ArrayList<StateList> data = b.getData();
		for (StateList eachstateList : data) {
			String name = eachstateList.getName();
			int id = eachstateList.getId();
			if (name.equals("Tamil Nadu")) {
				System.out.println(id);
				Assert.assertEquals(id, 35, "verify the statelist TN id is 35");
			}

		}

	}

	@Test
	private void Login() {

		addHeader("accept", "application/json");
		addBasicAuth("faiyazmhmmd@gmail.com", "Madurai@123");
		addRequestType("POST", "https://omrbranch.com/api/postmanBasicAuthLogin");
		int respondCode = getRespondCode(response);
		Assert.assertEquals(respondCode, 200, "verify the responseCode");

		Login_Output_pojo a = response.as(Login_Output_pojo.class);

		String first_name = a.getData().getFirst_name();
		Assert.assertEquals(first_name, "Faiyaz", "verify the firstName");

		String last_name = a.getData().getLast_name();
		Assert.assertEquals(last_name, "mohammed", "verify the lastName");

	}

}
