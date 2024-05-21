package com.OMRBranch.StepDefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.OMRBranch.BaseClass.BaseClass;
import com.OMRBranch.ObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep  extends BaseClass{
	
	static PageObjectManager pom=new PageObjectManager();

    @Given("User is on the omr branch page")
	public void user_is_on_the_omr_branch_page() throws FileNotFoundException, IOException {
	    browserLaunch(getPropertFileValue("browser"));
	    enterApplnUrl(getPropertFileValue("url"));
	    maximizeWindow();
	    implicitWait();
    	
	}
	@When("User login the {string} and {string}")
	public void user_login_the_and(String username, String password) {
	  
		pom.getLoginPage().Login(username, password);
	   
	}
	@Then("User should verify after Login Success message as {string}")
	public void user_should_verify_after_login_success_message_as(String exp_login_successmsg) {
		
		String act_loginSuccessMsgText = pom.getSearchHotelPage().getLoginSuccessMsgText();
		Assert.assertEquals("Verify after login success message", exp_login_successmsg, act_loginSuccessMsgText);
	   
	}
	
	@When("User Login the {string} and {string} using Enter key")
	public void user_login_the_and_using_enter_key(String username, String password) throws AWTException {
		
		pom.getLoginPage().LoginEnterKey(username, password);
	    
	}
	
    @Then("User should verify after login error message as {string}")
	public void user_should_verify_after_login_error_message_as(String exp_login_errormsg) {
    	String act_loginErrorMsgText = pom.getLoginPage().getLoginErrorMsgText();
    	boolean contains = act_loginErrorMsgText.contains(exp_login_errormsg);
    	Assert.assertTrue("verify after login error message", contains);
	    
	}
    



	




}
