package org.Swagger_document_day9;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Sample6 extends BaseClass {

	String Stateid;
	String logtoken;
	int stateidnum;
	int cityidnum;
	String addid;

	@Test(priority = 4)
	private void deletAddress() {
		List<Header> listHeaders = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + logtoken);
		Header h3 = new Header("Content-Type", "application/json");

		listHeaders.add(h1);
		listHeaders.add(h2);
		listHeaders.add(h3);

		Headers headers = new Headers(listHeaders);

		addHeaders(headers);
		
		deleteAddress_input_pojo delete=new deleteAddress_input_pojo(addid);
		
		addBody(delete);
		
		Response response = addRequestType("DELETE","https://omrbranch.com/api/deleteAddress");
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		Assert.assertEquals(statusCode,200,"verify ststus code");
		
		deleteAdress_output_pojo a = response.as(deleteAdress_output_pojo.class);
		  String message = a.getMessage();
		 System.out.println(message);
		
        Assert.assertEquals(message, "Address deleted successfully","verify the succes message");
		
		
		

	}

	@Test(priority = 3)
	
	
	private void creatAddress() {
		List<Header> listHeaders = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + logtoken);
		Header h3 = new Header("Content-Type", "application/json");

		listHeaders.add(h1);
		listHeaders.add(h2);
		listHeaders.add(h3);

		Headers headers = new Headers(listHeaders);

		addHeaders(headers);

		addUserAddress_input_pojo addUserAddress_input_pojo = new addUserAddress_input_pojo("faiyaz", "Mohammed",
				"9566466114", "2/24F", stateidnum, cityidnum, 101, "2020202", "omr", "home");
		addBody(addUserAddress_input_pojo);

		Response response = addRequestType("POST", "https://omrbranch.com/api/addUserAddress");

		int respondCode = getRespondCode(response);

		Assert.assertEquals(respondCode, 200, "verify the response code");

		addUserAddress_output_pojo a = response.as(addUserAddress_output_pojo.class);
		String message = a.getMessage();
		System.out.println(message);
		Assert.assertEquals(message, "Address added successfully", "verify the address created successfully");
  
		int address_id = a.getAddress_id();
		addid = String.valueOf(address_id);
		
	}

	@Test(priority = 2)
	private void GetCityList() {
		List<Header> listheaders = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Content-Type", "application/json");

		listheaders.add(h1);
		listheaders.add(h2);

		Headers headers = new Headers(listheaders);

		addHeaders(headers);

		CityList_Input_pojo citylist_input_pojo = new CityList_Input_pojo(Stateid);

		addBody(citylist_input_pojo);

		Response response2 = addRequestType("POST", "https://omrbranch.com/api/cityList");

		int respondCode = getRespondCode(response2);

		System.out.println(respondCode);

		Assert.assertEquals(respondCode, 200, "Verify the response code");

		CityList_Output_Pojo citylist_output_pojo = response.as(CityList_Output_Pojo.class);

		ArrayList<CityList> data = citylist_output_pojo.getData();

		for (CityList cityList : data) {
			String name = cityList.getName();

			if (name.equals("Madurai")) {

				cityidnum = cityList.getId();
				System.out.println(cityidnum);
				Assert.assertEquals(cityidnum, 3912, "verify the Madurai city id is 3912");
			}
		}

	}

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
			if (name.equals("Tamil Nadu")) {
				stateidnum = eachstateList.getId();
				Stateid = String.valueOf(stateidnum);

				System.out.println(stateidnum);
				Assert.assertEquals(stateidnum, 35, "verify the statelist TN id is 35");
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

		logtoken = a.getData().getLogtoken();
		System.out.println(logtoken);

	}

}
