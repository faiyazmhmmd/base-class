package org.testNG_Json_restAssure;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample_without_BaseClass {
	@Test
	private void getSingleuser() {

		RequestSpecification reqspe = RestAssured.given().header("content-type","application/json");
		
		Response response = reqspe.when().get("https://reqres.in/api/users/2");
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		Assert.assertEquals(statusCode, 200,"verfy respond code");
		
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
	}

}
