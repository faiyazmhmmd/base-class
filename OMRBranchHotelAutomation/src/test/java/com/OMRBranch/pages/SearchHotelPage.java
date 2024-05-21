 package com.OMRBranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OMRBranch.BaseClass.BaseClass;
import com.OMRBranch.ObjectManager.PageObjectManager;

import lombok.Data;


@Data
public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement gettexwelcome;

	@FindBy(xpath = "//h3[text()='Hotel Booking']")
	private WebElement btnHotalClick;

	@FindBy(id = "state")
	private WebElement bbn_state;

	@FindBy(id = "city")
	private WebElement bbn_city;

	@FindBy(id = "room_type")
	private WebElement ddn_romeatype;

	@FindBy(name = "check_in")
	private WebElement check_in;

	@FindBy(xpath = "//a[text()='28']")
	private WebElement check_in_date;

	@FindBy(name = "check_out")
	private WebElement check_out;

	@FindBy(xpath = "//a[text()='30']")
	private WebElement check_out_date;

	@FindBy(id = "no_rooms")
	private WebElement ddn_noRoom;

	@FindBy(id = "no_adults")
	private WebElement ddn_noAdult;

	@FindBy(id = "no_child")
	private WebElement no_Chid;

	@FindBy(id = "hotelsearch_iframe")
	private WebElement feame_search;

	@FindBy(id = "searchBtn")
	private WebElement btn_search;

	@FindBy(id = "invalid-state")
	private WebElement stateErrorMsg;

	@FindBy(id = "invalid-city")
	private WebElement cityErrorMsg;

	@FindBy(id = "invalid-check_in")
	private WebElement checkInErrormsg;

	@FindBy(id = "invalid-check_out")
	private WebElement checkOutErrormsg;

	@FindBy(id = "invalid-no_rooms")
	private WebElement noRoomErrorMsg;

	@FindBy(id = "invalid-no_adults")
	private WebElement noAdultsErrorMsg;

	
	
	
	public void afterLoginNavigatetoMyBooking() {
		
	}
	
	public String getLoginSuccessMsgText() {

		String getTextWelcomeMsg = elementGetText(gettexwelcome);
		return getTextWelcomeMsg;

	}
	
	
	
	
	
	

//senario 1, 4 & 5
	public void searchHotel(String stateName, String cityName, String roomType, String checkINDate, String checkOutDate,
		String noOfRooms, String adultCount, String childCount) {

		elementClick(btnHotalClick);
		
		selectOptionByText(bbn_state, stateName);

		selectOptionByText(bbn_city, cityName);

		selectRoomType(roomType);

		elementclick(check_in);
		elementClick(check_in_date);

		elementclick(check_out);
		elementClick(check_out_date);

		selectOptionByText(ddn_noRoom, noOfRooms);

		selectOptionByText(ddn_noAdult, adultCount);

		elementSendKeys(no_Chid,childCount);
		
		elementFrame(feame_search);
		elementClick(btn_search);

	}

	// Senario 2 mandatory fields
	public void searchHotalMandatoryField(String stateName, String cityName, String checkINDate, String checkOutDate,
			String noOfRooms, String adultCount) {
		elementClick(btnHotalClick);
		
		selectOptionByText(bbn_state, stateName);

		selectOptionByText(bbn_city, cityName);

		elementclick(check_in);
		elementClick(check_in_date);

		elementclick(check_out);
		elementClick(check_out_date);

		selectOptionByText(ddn_noRoom, noOfRooms);

		selectOptionByText(ddn_noAdult, adultCount);
		
		elementFrame(feame_search);
		elementClick(btn_search);

	}

	// senario 3(without field click search)
	public void searchHotelWithoutMandatoryField() {
		
		elementClick(btnHotalClick);
		elementFrame(feame_search);
		elementClick(btn_search);
		driver.switchTo().defaultContent();
	}

	// senario 5(to Select all room type)
	public void selectRoomType(String roomType) {
		
		String[] split = roomType.split("/");
		
		for (String X : split) {
			selectOptionByText(ddn_romeatype, X);
		}

	}

	public String getStateNameErrorMsgText() {
		
		String gettextStateErrormsg = elementGetText(stateErrorMsg);
		return gettextStateErrormsg;
	}

	public String getCityNameErrorMsgText() {
		
		String getTextCityErrorMsg = elementGetText(cityErrorMsg);
		return getTextCityErrorMsg;
	} 

	public String getCheckInErrormsg() {
		
		String getTextCheckInErrorMsg = elementGetText(checkInErrormsg);
		return getTextCheckInErrorMsg;

	}

	public String getCheckOutErrorMsg() {
		
		String getTextCheckOutErrorMsg = elementGetText(checkOutErrormsg);
		return getTextCheckOutErrorMsg;
	}

	public String getnoOfRoomErrorMsg() {
		
		String getTextNoRoomErrorMsg = elementGetText(noRoomErrorMsg);
		return getTextNoRoomErrorMsg;

	}

	public String getNoAdultsErrorMsg() {
		
		String getTextNoAdultErrorMsg = elementGetText(noAdultsErrorMsg);
		return getTextNoAdultErrorMsg;
	}

}
