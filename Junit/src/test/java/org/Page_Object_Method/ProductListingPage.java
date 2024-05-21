package org.Page_Object_Method;

import org.BaseClass.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListingPage extends base {
	
	public ProductListingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h5[contains(text(),'Search Result')]")
	private WebElement gettxtsearchnuts;
	
	
	@FindBy(xpath="(//a[text()='Add'])[1]")
    private WebElement btnNutsAdd;
	
	@FindBy(xpath="(//button[text()='Add'])[1]")
	private WebElement btn_addnut_variant;
	
	@FindBy(xpath="//a[@class='hover1']")
	private WebElement btngo_to_cart;
	
	public String getTxtsearchnuts() {
		String getText = elementGetText(gettxtsearchnuts);
		return getText;
	}

	public WebElement getBtnNutsAdd() {
		return btnNutsAdd;
	}

	public WebElement getBtn_addnut_variant() {
		return btn_addnut_variant;
	}

	public WebElement getBtngo_to_cart() {
		return btngo_to_cart;
	}
	
	public void addProduct() throws InterruptedException {
		elementClick(btnNutsAdd);
		elementClick(btn_addnut_variant);
		Thread.sleep(3000);
		elementClick(btngo_to_cart);
	}
	

}
