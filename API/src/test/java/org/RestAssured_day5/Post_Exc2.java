package org.RestAssured_day5;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Exc2 {

	public static void main(String[] args) {

		RequestSpecification ReqSpe;
		ReqSpe = RestAssured.given();
		ReqSpe = ReqSpe.headers("content-type", "application/json");
		ReqSpe = ReqSpe.body("{\r\n" + "    \"flightName\": \"AirIndia\",\r\n" + "    \"Country\": \"India\",\r\n"
				+ "    \"Destinations\": \"87\",\r\n"
				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n" + "}");
		Response response = ReqSpe.when().post("https://omrbranch.com/api/flights");

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);

	}

}
