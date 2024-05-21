package com.OMRBranch.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotelPage {
	
	@FindBy(xpath = "//*[@resource-id='select_hotel_text']")
	private WebElement getSelectHotelSucMSG;
	
	@FindBy(xpath = "//*[@resource-id='hotel_continue_button']")
	private WebElement btn_continue;
	
	@FindBy(xpath = "//*[@text='OK']")
	private WebElement alret_ok;
	
	

}
