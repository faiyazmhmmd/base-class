package com.api.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	RequestSpecification ReqSpe;
	Response response;
	public static WebDriver driver;
	

	public void addHeader(String headername, String headervalue) {

		ReqSpe = RestAssured.given().header(headername, headervalue);

	}

	public void addHeaders(Headers headers) {
		ReqSpe = RestAssured.given().headers(headers);
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
			response = ReqSpe.when().put(url);
			break;

		case "PATCH":
			response = ReqSpe.when().patch(url);
			break;

		case "DELETE":
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

	public void addBasicAuth(String username, String password) {
		ReqSpe = ReqSpe.auth().preemptive().basic(username, password);
	}

	public void addFormData(String key, File filepath) {
		ReqSpe = ReqSpe.multiPart(key, filepath);
	}

	public void addBody(String body) {
		ReqSpe = ReqSpe.body(body);
	}

	public void addBody(Object body) {
		ReqSpe = ReqSpe.body(body);
	}

	public String getProjectpath() {// this is used to get the project location
		String projectpath = System.getProperty("user.dir");
		return projectpath;

	}

	public String getPropertFileValue(String key) throws FileNotFoundException, IOException {//this is used to get the value from property file

		Properties p = new Properties();
		p.load(new FileInputStream(getProjectpath() + "\\config\\config.properties"));
		Object o = p.get(key);
		String value = (String) o;
		return value;

	}

}
