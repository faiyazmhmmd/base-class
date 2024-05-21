package org.suitle_level_execution;

import org.baseclass.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sample1 extends base {
	public sample1() {
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
	
	public void login(String username,String password) {
		elementSendKeys(txtlogin, username);
		elementSendKeys(txtpass, password);
	}
	

}
