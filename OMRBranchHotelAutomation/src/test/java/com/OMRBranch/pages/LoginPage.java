package com.OMRBranch.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OMRBranch.BaseClass.BaseClass;





public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement txtusername;

	@FindBy(id = "pass")
	private WebElement txtpassword;

	@FindBy(xpath = "//button[text()='Login']")
	private WebElement btnlogin;

	@FindBy(id = "errorMessage")
	private WebElement txtloginerrormsg;

	

	// loginsenario 1 & 3
	public void Login(String email, String password) {
		elementSendKeys(txtusername, email);
		elementSendKeys(txtpassword, password);
		elementclick(btnlogin);
	}

	// loginsenario 2
	public void LoginEnterKey(String email, String password) throws AWTException {

		elementSendKeys(txtusername, email);
		elementSendKeys(txtpassword, password);
		enterelementkey();

	}

    //verify login error msg
	public String getLoginErrorMsgText() {
		String elementGetText = elementGetText(txtloginerrormsg);
		return elementGetText;

	}
	
}
