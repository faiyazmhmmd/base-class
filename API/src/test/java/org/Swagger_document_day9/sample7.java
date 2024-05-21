package org.Swagger_document_day9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample7 extends BaseClass {
	
	String Stateid;
	String logtoken;
	int stateidnum;
	int cityidnum;
	String addressid;
	
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
		

	}
    private  static void search() {
    	
	

}

	

}
