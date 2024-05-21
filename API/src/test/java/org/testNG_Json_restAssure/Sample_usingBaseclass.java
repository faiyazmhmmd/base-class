package org.testNG_Json_restAssure;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Sample_usingBaseclass extends BaseClass {
	
@Test
private void getSingleUser() {

	setHeader("content-type", "application/json");
	
	Response response = addRequestType("GET","https://reqres.in/api/users/2");
	
	 int respondCode = getRespondCode(response);
	 
	 
	 
	 Assert.assertEquals(respondCode, 200,"verify the responsecode");
	 
	 String respondBodyAsPrettyString = getRespondBodyAsPrettyString(response);
	 
}

}
