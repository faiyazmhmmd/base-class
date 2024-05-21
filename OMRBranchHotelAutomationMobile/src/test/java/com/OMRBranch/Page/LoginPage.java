package com.OMRBranch.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Data;
@Data
public class LoginPage {
	
	@FindBy(xpath = "//*[@resource-id='login_email_input']")
	private WebElement txt_Login;
	
	@FindBy(xpath = "//*[@resource-id='login_password_input']")
	private WebElement txt_pass;
	
	@FindBy(xpath = "//*[@resource-id='login_button']")
	private WebElement btn_login;
	
	

}
