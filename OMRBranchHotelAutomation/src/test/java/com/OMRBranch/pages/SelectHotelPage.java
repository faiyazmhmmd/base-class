package com.OMRBranch.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OMRBranch.BaseClass.BaseClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class SelectHotelPage extends BaseClass {

	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	public static String hotelName;
	public static String hotelprice;
	
	@FindBy(xpath = "//h5[text()='Select Hotel']")
	private WebElement gettxtSelecthotel;
	
	@FindBy(id="room_type")
	private WebElement getheader;

	@FindBy(xpath = "(//div[@class='col-md-5 hotel-suites']//h5)[1]")
	private WebElement getHotelName;

	@FindBy(xpath = "(//div[@class='col-md-5 hotel-suites']//h5)")
	private List<WebElement> getAllHotalNamer;

	@FindBy(xpath = "(//strong[@class='total-prize'])[1]")
	private WebElement gettxt_price;

	@FindBy(xpath = "(//a[text()='Continue'])[1]")
	private WebElement btn_continue;

	@FindBy(xpath = "//label[text()='Price low to high']")
	private WebElement radbtn_pricelowtohigh;

	@FindBy(xpath = "//label[text()='Price High to low']")
	private WebElement radbtn_pricehightolow;

	@FindBy(xpath = "//label[text()='Name Ascending']")
	private WebElement radbtn_nameAsc;

	@FindBy(xpath = "//label[text()='Name Descending']")
	private WebElement radbtn_nameDes;

	@FindBy(xpath = "(//div[@class='prize']//strong)")
	private List<WebElement> priceLowToHigh;

	@FindBy(xpath = "(//div[@class='prize']//strong)")
	private List<WebElement> priceHighToLow;

	@FindBy(xpath = "(//div[@class='col-md-5 hotel-suites']//h5)")
	private List<WebElement> nameAscending;

	@FindBy(xpath = "(//div[@class='col-md-5 hotel-suites']//h5)")
	private List<WebElement> nameDescending;

	
	
	
	public String getFirstHotelPrice() {
		 String elementGetText = elementGetText(gettxt_price);
		 hotelprice = elementGetText.substring(2);
		return hotelprice;
	}
	
	public String getFirstHotelName() {
		hotelName = elementGetText(getHotelName);
		return hotelName;
	}
	
	
	public String getSelectHotelSuccessMsg() {

		String getTextSelectHotelMsg = elementGetText(gettxtSelecthotel);
		
		return getTextSelectHotelMsg;
	}

	public boolean verifyHotelNameEndsWithRoomType(String roomtype) {
		//String roomtype = "Standard";
		for (WebElement webElement : getAllHotalNamer) {

			String hotelnames = elementGetText(webElement);
   
			List<String> asList = Arrays.asList(hotelnames);

			List<Boolean> listres = new ArrayList<>();

			for (String hotelname : asList) {
				boolean b = hotelname.endsWith(roomtype);
				listres.add(b);
			}

			boolean contains = asList.contains(false);
			System.out.println(contains);
		}
		return false;

	}
	public String verifyHotalTypeInHeader() {
		String gettxtHeader = elementGetText(getheader);
		return gettxtHeader;
	}

	
	public void verifyHotelPriceLowToHigh() throws InterruptedException  {
		
	threadsleep(3000);
		List<String> qa=new ArrayList<String>();
		for (WebElement webElement : priceLowToHigh) {
			
			String priceHL = elementGetText(webElement);
			String subString = priceHL.substring(1);
			System.out.println(subString);
			String priceLH2 = subString.replace(",","");
			qa.add(priceLH2);
		}
		System.out.println(qa);
		Collections.sort(qa);
		List<String> dev = new ArrayList<String>(qa);
		boolean equals = qa.equals(dev);
		if(equals) {
			System.out.println("Hotel price in low to high");
		}
		else {
			System.out.println("hptel price is not correct");
		}
		
			
			
//			String priceLH = elementGetText(webElement);
//		    System.out.println(priceLH);
//			List<String> asList = Arrays.asList(priceLH);
//			List<String> qa=new ArrayList<String>(asList);
//			Collections.sort(asList);// (convert in ascending order)
//			List<String> dev = new ArrayList<String>(asList);
//			boolean equals = dev.equals(qa);
//			System.out.println(equals);
		}

	

	public void verifyHotelPriveHighToLow() throws InterruptedException {
		threadsleep(3000);
		List<String> qa=new ArrayList<String>();
		for (WebElement webElement : priceHighToLow) {
			
			String priceLH = elementGetText(webElement);
			String subString = priceLH.substring(1);
			System.out.println(subString);
			String priceLH2 = subString.replace(",","");
			qa.add(priceLH2);
		}
		System.out.println(qa);
		Collections.sort(qa);
		Collections.reverse(qa);
		List<String> dev = new ArrayList<String>(qa);
		boolean equals = qa.equals(dev);
		if(equals) {
			System.out.println("Hotel price in high to low");
		}
		else {
			System.out.println("hptel price is not correct");
		}
//		for (WebElement webElement : priceHighToLow) {
//			String priceLH = elementGetText(webElement);
//			List<String> asList = Arrays.asList(priceLH);
//
//			List<String> dev = new ArrayList<String>(asList);
//			List<String> qa = new ArrayList<String>(asList);
//			boolean equals = dev.equals(qa);
//			System.out.println(equals);
//		}
	}

	public void verifyHotelNameAscending() throws InterruptedException {
		
		threadsleep(3000);
		List<String> qa=new ArrayList<String>();
		for (WebElement webElement : nameAscending) {
			String NameAsc = elementGetText(webElement);
			qa.add(NameAsc);
		}
		System.out.println(qa);
		Collections.sort(qa);
		
		List<String> dev = new ArrayList<String>(qa);
		boolean equals = qa.equals(dev);
		if(equals==true) {
			System.out.println("Hotel Name in Ascending");
		}
		else {
			System.out.println("hptel Name is not in Ascendin order");
		}
	}

	public void verifyHotelNameDescending() throws InterruptedException {
		
		threadsleep(3000);
		List<String> qa=new ArrayList<String>();
		for (WebElement webElement : nameDescending) {
			String NameDes = elementGetText(webElement);
			qa.add(NameDes);
		}
		System.out.println(qa);
		Collections.sort(qa);
		//Collections.reverse(qa);
		List<String> dev = new ArrayList<String>(qa);
		boolean equals = qa.equals(dev);
		if(equals) {
			System.out.println("Hotel Name in Decending");
		}
		else {
			System.out.println("hptel Name is not in Ascendin order");
		}
//		for (WebElement webElement : nameDescending) {
//			String priceLH = elementGetText(webElement);
//			List<String> asList = Arrays.asList(priceLH);
//
//			List<String> dev = new ArrayList<String>(asList);
//			List<String> qa = new ArrayList<String>(asList);
//			boolean equals = dev.equals(qa);
//			System.out.println(equals);
//
//		}
	}

	public void clickPriceHightoLow() {
		elementClick(radbtn_pricehightolow);
	}

	public void clickPriceLowToHigh() {
		elementClick(radbtn_pricelowtohigh);
	}

	public void clickHotelNameAscending() {
		elementClick(radbtn_nameAsc);
	}

	public void clickHotelNameDescending() {
		elementClick(radbtn_nameDes);
	}

	public void clickContinue() {
		elementClick(btn_continue);
	}

	public void clickAlertAccept() {
		elementAlert_accept();
	}

	public void clickAlertDismiss() {
	elementAlert_dismiss();
	}
}
