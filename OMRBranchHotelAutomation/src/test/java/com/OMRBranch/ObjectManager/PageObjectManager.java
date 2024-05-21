package com.OMRBranch.ObjectManager;

import com.OMRBranch.pages.BookingConfirmationPage;
import com.OMRBranch.pages.BookingHotelPage;
import com.OMRBranch.pages.LoginPage;
import com.OMRBranch.pages.MyBookingPage;
import com.OMRBranch.pages.SearchHotelPage;
import com.OMRBranch.pages.SelectHotelPage;

public class PageObjectManager {

	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookingHotelPage bookingHotelPage;
	private BookingConfirmationPage bookingConfirmationPage;
	private MyBookingPage myBookingPage;
	
	
	public LoginPage getLoginPage() {
		return (loginPage==null)?loginPage=new LoginPage():loginPage;
	}
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage==null)?searchHotelPage=new SearchHotelPage():searchHotelPage;
	}
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)?selectHotelPage=new SelectHotelPage():selectHotelPage;
	}
	public BookingHotelPage getBookingHotelPage() {
		return (bookingHotelPage==null)?bookingHotelPage=new BookingHotelPage():bookingHotelPage;
	}
	public BookingConfirmationPage getBookingConfirmationPage() {
		return (bookingConfirmationPage==null)?bookingConfirmationPage=new BookingConfirmationPage():bookingConfirmationPage;
	}
	public MyBookingPage getMyBookingPage() {
		return (myBookingPage==null)?myBookingPage=new MyBookingPage():myBookingPage;
	}
	
	
	
}
