package com.OMRBranch.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotelPage {
	
	@FindBy(xpath = "//*[@resource-id='book_hotel_text']")
    private WebElement gettxt_bookHotel;
	
	@FindBy(xpath = "(//*[@resource-id='book_hotel_booking_for'])[2]")
	private WebElement radio_MySelf;
	
	@FindBy(xpath = "//*[@text='Select Salutation']")
	private WebElement click_salutation;
	
	@FindBy(xpath = "//*[@text='Mr.']")
	private WebElement click_Mr;
	
	@FindBy(xpath = "//*[@resource-id='book_hotel_first_name']")
	private WebElement txt_firstName;
	
	@FindBy(xpath = "//*[@resource-id='book_hotel_last_name']")
	private WebElement txt_lastName;
	
	@FindBy(xpath = "//*[@resource-id='book_hotel_mobile_no']")
	private WebElement txt_mobileNo;
	
	@FindBy(xpath = "//*[@resource-id='book_hotel_email']")
	private WebElement txt_email;
	
	@FindBy(xpath = "//*[@text='Enter GST Details (Optional)']")
	private WebElement checkbox_GST;
	
	@FindBy(xpath = "//android.widget.EditText[@content-desc='book_hotel_registration']")
	private WebElement txt_gstreg;
	
	@FindBy(xpath = "//android.widget.EditText[@content-desc='book_hotel_company_name']")
	private WebElement txt_gstcompany;
	
	@FindBy(xpath = "//android.widget.EditText[@content-desc='book_hotel_company_address']")
	private WebElement txt_gstaddress;
	
	@FindBy(xpath = "//*[@resource-id='book_hotel_next_button']")
	private WebElement btn_next;
	
	@FindBy(xpath = "//*[@text='Smoking Room']")
	private WebElement btn_Smok_room;
	
	@FindBy(xpath = "(//*[@resource-id='book_hotel_any_other_request'])[2]")
	private WebElement txt_Request;
	
    @FindBy(xpath = "//*[@text='Credit/Debit/ATM Card']")
	private WebElement btn_cardpayment;
	
	
	
}
