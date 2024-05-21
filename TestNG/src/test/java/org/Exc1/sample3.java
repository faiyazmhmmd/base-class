package org.Exc1;

import org.baseclass.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sample3 extends base{
    
	public sample3() {
	PageFactory.initElements(driver, this);
    }
	@FindBy(xpath="//input[@id='search']")
	private WebElement txtSearchButton;
	
	
	public WebElement getTxtSearchButton() {
		return txtSearchButton;
	}	
	
	public void search(String pname) {
		elementSendKeyEnter(txtSearchButton, pname);
		elementcleartxtbox(txtSearchButton);
		
	}
	




}


