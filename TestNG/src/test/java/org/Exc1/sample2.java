package org.Exc1;

import org.baseclass.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sample2 extends base{
	
	public sample2() {
		PageFactory.initElements(driver,this);
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
	
	public void login(String userName,String passWord) {
		elementSendKeys(txtUsername, userName);
		elementSendKeys(txtpassword, passWord);
        elementclick(btnLogin);		
	}
}
