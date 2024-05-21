package org.testNG_Json_restAssure;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	RequestSpecification ReqSpe;
	Response response;

	public void setHeader(String headername, String headervalue) {

		ReqSpe = RestAssured.given().header(headername, headervalue);

		
	}

	public Response addRequestType(String reqType, String url) {

		switch (reqType) {
		case "GET":
			response = ReqSpe.when().get(url);

			break;
		case "POST":
			response = ReqSpe.when().post(url);
			break;
		case "PUT":
			response = ReqSpe.when().post(url);
			break;
		case "PATCH":
			response = ReqSpe.when().patch(url);
			break;
		case "DELET":
			response = ReqSpe.when().delete(url);
			break;
		default:
			break;
		}
		return response;

	}

	public int getRespondCode(Response response) {

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		return statusCode;
	}

	public String getRespondBodyAsString(Response response) {

		String asString = response.getBody().asString();

		System.out.println(asString);
		return asString;
	}

	public String getRespondBodyAsPrettyString(Response response) {
		String asPrettyString = response.getBody().asPrettyString();
		System.out.println(asPrettyString);
		return asPrettyString;

	}
	

}
