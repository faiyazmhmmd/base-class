package org.Page_Object_Method;
import java.util.List;

import org.BaseClass.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
public class SearchProductPage extends base {
	
	public SearchProductPage() {
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath="//a[@data-testid='username']")
	 private WebElement txtLoginSuccessMsg;
	
	
	
	@FindBy(xpath="//span[@class='cart badge badge-xs badge-danger position-relative mr-0 cart_count']")
	private WebElement elementincart;
	
	@FindBy(xpath="//i[@class='fa fa-shopping-cart']")
	private WebElement btn_cart;
	
	@FindBy(xpath="//div[@class='scheduleClose']")
	private List<WebElement> btn_cancell;
	
	@FindBy(xpath="//a[text()=' Close ']")
	private WebElement cartclose;
	
	@FindBy(xpath="//input[@id='search']")
	private WebElement txtSearchButton;
    
	
	public String getTxtLoginSuccessMsg() {
		String loginsuccesmsg = elementGetText(txtLoginSuccessMsg);
		return loginsuccesmsg;
	}

	public WebElement getElementincart() {
		return elementincart;
	}


	public WebElement getBtn_cart() {
		return btn_cart;
	}


	public List<WebElement> getBtn_cancell() {
		return btn_cancell;
	}
	
	
	public WebElement getCartclose() {
		return cartclose;
	}




	public WebElement getTxtSearchButton() {
		return txtSearchButton;
	}


	public String elementcart() {
		
		String elementcart = elementGetText(getElementincart());
		String a="0";
		if(elementcart!=a) {
			elementClick(btn_cart);
			for(WebElement X:btn_cancell) {
				visiblityOf(X);
				elementClick(X);
			}}
		
		elementClick(cartclose);
		return elementcart;
		
	}
	
	public void productsearch(String pname) {
		elementSendKeyEnter(txtSearchButton, pname);
	}
}

			
			
			
		
		
	 
	 

