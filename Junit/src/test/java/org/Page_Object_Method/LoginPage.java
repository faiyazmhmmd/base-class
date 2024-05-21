package org.Page_Object_Method;


import org.BaseClass.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends base{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="email")
	private WebElement txtUsername;
    
	@FindBy(id="pass")
	private WebElement txtpassword;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement btnLogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void Login(String username,String pass) {
		elementSendKeys(txtUsername, username);
		elementSendKeys(txtpassword, pass);
		elementClick(btnLogin);
		
	}
	
	
	
}



