package com.OMRBranch.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OMRBranch.BaseClass.BaseClass;

public class MyBookingPage extends BaseClass{
	
	public MyBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='col-md-5'])[1]")
	private WebElement gettext_booking;

	
	
	@FindBy(xpath = "//input[contains(@class,'form-control w-50')]")
	private WebElement txt_SearchOrderid;

	@FindBy(xpath = "(//div[@class='col-md-7 mobile-space-none']//h5)[1]")
	private WebElement getHotelnameinMyBooking;

	@FindBy(xpath = "(//strong[@class='total-prize'])[1]")
	private WebElement getHotelPriceMyBooking;
	
	@FindBy(xpath = "(//div[@class='room-code']//span)[1]")
	private WebElement getHotelOrderIdMyBooking;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement btn_edit;

	@FindBy(xpath = "//input[contains(@class,'form-control from')]")
	private WebElement clickchickin;

	@FindBy(xpath = "//a[contains(text(),'29')]")
	private WebElement clickChickinDate;

	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement btn_Conform;

	@FindBy(xpath = "//li[@class='alertMsg']")
	private WebElement gettext_upupdate_OR_cancel_msg;

	@FindBy(xpath = "//span[text()='HOME']")
	private WebElement btn_home;

	@FindBy(xpath = "//a[contains(text(),'Welcome Faiyaz')]")
	private WebElement gettxtwelcome3;

	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement gettext_booking2;
	
	@FindBy(xpath = "(//a[contains(@class,'cancle btn')])[1]")
	private WebElement btn_cancel;
	
	
	
	public void cancelOrderId() {
		elementClick(btn_cancel);
		elementAlert_accept();
	}
	
	public void modifyChickinDate() {
		elementClick(btn_edit);
		elementClick(clickchickin);
		elementClick(clickChickinDate);
		elementClick(btn_Conform);
		
	}
	
	public void searchExistingOrderId(String OrderId) throws AWTException {
		elementSendKeys(txt_SearchOrderid, OrderId);
		enterelementkey();
	}
	
	public String getUpdatOrCancelesuccessmsg() {
		String txt_getupdatesuccessmsg = elementGetText(gettext_upupdate_OR_cancel_msg);
		return txt_getupdatesuccessmsg;
	}
	
	 public void searchOrderId() throws AWTException {
		 elementSendKeys(txt_SearchOrderid,BookingConfirmationPage.OrderId);
		 enterelementkey();
	 }
	public String getBookingsuccessmsg() {
		implicitWait();
		String gettxtBookingSuccessMsg = elementGetText(gettext_booking);
		
		return gettxtBookingSuccessMsg;
		
	}
	public String getMyBookingHotelName() {
		String getTxtMyBookingHotelName = elementGetText(getHotelnameinMyBooking);
		return getTxtMyBookingHotelName;
	}
	public String getMyBookingHotelPrice() {
		 String elementGetText = elementGetText(getHotelPriceMyBooking);
		 String getTxtMyBookingHotelPrice = elementGetText.substring(3);
		
		return getTxtMyBookingHotelPrice;
	}
	public String getMyBookingHotelOrderid() {
		String getTxtMyBookingHotelOrderId = elementGetText(getHotelOrderIdMyBooking);
		return getTxtMyBookingHotelOrderId;
	}

}
//@FindBy(xpath = "(//div[@class='room-code']//span)[1]")
//private WebElement getbookedorderid;
//
//@FindBy(xpath = "(//strong[@class='total-prize'])[1]")
//private WebElement getBookedHotelPrice;
//
//@FindBy(xpath = "(//div[@class='col-md-7 mobile-space-none']//h5)[1]")
//private WebElement getBookedhotalnamecon;
//
//@FindBy(xpath = "(//input[@type='text'])[1]")
//private WebElement txt_searchorderid;
//
//@FindBy(xpath = "//h4[contains(text(),'Bookings')]")
//private WebElement gettxtbookingsuccessmsg;
//
//@FindBy(xpath = "//button[text()='My Booking']")
//private WebElement btn_My_account;
//
//@FindBy(xpath = "(//button[@type='submit'])[1]")
//private WebElement btn_Edit;
//
//@FindBy(xpath = "(//a[contains(@class,'cancle btn')])[1]")
//private WebElement btn_Cancel;
//
//@FindBy(xpath = "//input[@name='check_in']")
//private WebElement modify_chickin_date;
//
//@FindBy(xpath = "//a[text()='26']")
//private WebElement modify_date;