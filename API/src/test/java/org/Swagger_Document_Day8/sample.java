package org.Swagger_Document_Day8;

import org.testng.annotations.Test;

public class sample extends BaseClass{
@Test
private void login() {

	addHeader("accept", "application/json");
	
	addBasicAuth("greenstechchennaiomr@gmail.com", "Learn@123");
	
	addRequestType("POST","https://omrbranch.com/api/postmanBasicAuthLogin");
	
	int respondCode = getRespondCode(response);
	
}

}
