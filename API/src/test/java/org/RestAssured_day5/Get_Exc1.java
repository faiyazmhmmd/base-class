package org.RestAssured_day5;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Exc1 {

	public static void main(String[] args) {
		
		RequestSpecification a;

		//initilize the restassured class by using give method
		 a= RestAssured.given();
		
		 //pass the header (or)authoration (or) request body
		a = a.header("containt-type","application/json");
		
		//Request type(or)endpoint--
		Response b = a.get("https://omrbranch.com/api/flight/ 24111");
		
		//to print the status code(or)response code for verification
		int code = b.getStatusCode();
		System.out.println(code);
		
		//to print the request Body
		String asString = b.asString();
		System.out.println(asString);
		
		//to print the request body in proper alligment
		String prettyString = b.asPrettyString();
		System.out.println(prettyString);
		
		
	}

}
