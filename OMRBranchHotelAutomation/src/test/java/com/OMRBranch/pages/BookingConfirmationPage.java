package com.OMRBranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OMRBranch.BaseClass.BaseClass;

import lombok.Data;
@Data
public class BookingConfirmationPage extends BaseClass {
	
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	 public static String OrderId;
	 
	@FindBy(xpath = "//strong[contains(text(),'#')]")
	private WebElement conformpageorderid;
	
	@FindBy(xpath = "//h2[@class='couppon-code']")
	private WebElement conformpagesuccessmsg;
	
	@FindBy(xpath = "(//div[@class='seccess-box text-center']//strong)[2]")
	private WebElement conformpagehotelname;
	
	@FindBy(xpath = "(//div[@class='room-code']//span)[1]")
	private WebElement getbookedorderid;
	
	@FindBy(xpath = "(//strong[@class='total-prize'])[1]")
	private WebElement getBookedHotelPrice;
	
	@FindBy(xpath = "(//div[@class='col-md-7 mobile-space-none']//h5)[1]")
	private WebElement getBookedhotalnamecon;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement txt_searchorderid;
	
	@FindBy(xpath = "//h4[contains(text(),'Bookings')]")
	private WebElement gettxtbookingsuccessmsg;
	
	@FindBy(xpath = "//button[text()='My Booking']")
	private WebElement btn_My_account;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement btn_Edit;
	
	@FindBy(xpath = "(//a[contains(@class,'cancle btn')])[1]")
	private WebElement btn_Cancel;
	
	@FindBy(xpath = "//input[@name='check_in']")
	private WebElement modify_chickin_date;
	
	@FindBy(xpath = "//a[text()='26']")
	private WebElement modify_date;
	
	@FindBy(xpath = "(//a[@data-toggle='dropdown'])[1]")
	private WebElement clickWelcome;
	
	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	private WebElement clickMyAccount;
	
	
	public String getOrderId() {
		OrderId = elementGetText(conformpageorderid);
		return OrderId;
		
	}
	public String getbookinconformsuccessmsg() {
		implicitWait();
		String gettxtBookSuccessMsg = elementGetText(conformpagesuccessmsg);
		return gettxtBookSuccessMsg;
	}

	public String getBookHotelName() {
		String gettxtBookHotelNmae = elementGetText(conformpagehotelname);
		return gettxtBookHotelNmae;
	}
	public void navigate_mybooking() throws InterruptedException {
		elementClick(clickWelcome);
		elementclick(clickMyAccount);
	}
	
}
