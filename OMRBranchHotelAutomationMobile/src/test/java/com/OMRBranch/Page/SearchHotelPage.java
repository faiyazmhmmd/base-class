package com.OMRBranch.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotelPage {
	
	@FindBy(xpath = "//*[@resource-id='header_welcome']")
	private WebElement gettxt_welcome;
	
	@FindBy(xpath = "//*[@resource-id='search_select_state']")
	private WebElement click_State;
	
	@FindBy(xpath = "//*[@text='Andhra Pradesh']")
	private WebElement ddn_State;
	
	@FindBy(xpath = "//*[@text='Select City']")
	private WebElement click_city;
	
	@FindBy(xpath = "//*[@text='Tirupati']")
	private WebElement ddn_city;
	
	@FindBy(xpath = "//*[@text='Select Room Type']")
	private WebElement click_roomType;
	
	@FindBy(xpath = "//*[@text='Standard']")
	private WebElement ddn_roomType;
	
	@FindBy(xpath = "//*[@resource-id='search_select_checkin']")
	private WebElement click_checkin;
	
	@FindBy(xpath = "//*[@text='22']")
	private WebElement click_checkin_Date;
	
	@FindBy(xpath = "//*[@text='OK']")
	private WebElement click_checkin_ok;
	
	@FindBy(xpath = "//*[@resource-id='search_select_checkout']")
	private WebElement click_checkout;
	
	@FindBy(xpath = "//*[@text='24']")
	private WebElement click_checkout_Date;
	
	@FindBy(xpath = "//*[@text='OK']")
	private WebElement click_checkout_ok;
	
	@FindBy(xpath = "//*[@text='No. Of Room']")
	private WebElement click_noofroom;
	
	@FindBy(xpath = "//*[@text='1-One']")
	private WebElement ddn_noofroom;
	
	@FindBy(xpath = "//*[@text='No. Of Adults']")
	private WebElement click_noofadults;
	
	@FindBy(xpath = "//*[@text='1-One']")
	private WebElement ddn_noofadult;
	
	@FindBy(xpath = "//*[@resource-id='search_no_of_children']")
	private WebElement txt_noOfChild;
	
	@FindBy(xpath = "//*[@resource-id='search_button']")
	private WebElement btn_search;
	

	
	

}
