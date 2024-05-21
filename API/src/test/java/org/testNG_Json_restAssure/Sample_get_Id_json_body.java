package org.testNG_Json_restAssure;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Sample_get_Id_json_body extends BaseClass {
	@Test
	public void getId_fromJson() {
 
		setHeader("content-type", "application/json");
		
		Response response = addRequestType("GET","https://reqres.in/api/users/2");
		
		JsonPath jsonPath = response.jsonPath();
		
		int int1 = jsonPath.getInt("data.id");
		System.out.println(int1);
		
		Assert.assertEquals(int1, 2,"verify the id from JSON body are equal");
		
		String string = jsonPath.getString("support.url");
		
		System.out.println(string);
		
		Assert.assertEquals(string, "https://reqres.in/#support-heading","verify the URL from JSON body are equal");
		
	}

}
