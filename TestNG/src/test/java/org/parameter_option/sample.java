package org.parameter_option;

import org.baseclass.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sample extends base {
	public sample() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement txtlogin;
	
	@FindBy(id="pass")
	private WebElement txtpass;

	public WebElement getTxtlogin() {
		return txtlogin;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}
	
	public void login(String userName,String password) {
		elementSendKeys(txtlogin, userName);
		elementSendKeys(txtpass, password);
	}

}
