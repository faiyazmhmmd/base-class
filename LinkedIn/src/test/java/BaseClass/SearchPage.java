package BaseClass;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class SearchPage extends base {
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='t-16 t-black t-bold']")
	private WebElement txtLoginSuccessMsg;
	
	@FindBy(xpath = "//li-icon[@type='job-active']")
	private WebElement btnJob;

	public String getTxtLoginSuccessMsg() {
		String elementGetText = elementGetText(txtLoginSuccessMsg);
		return elementGetText;
	}
	

	public WebElement getBtnJob() {
		return btnJob;
	}
	
	public void search() {
		
		elementClick(btnJob);
		
	}
	
	

}
