package com.OMRBranch.pages;

import org.hamcrest.Factory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OMRBranch.BaseClass.BaseClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class BookingHotelPage extends BaseClass {
	public BookingHotelPage() {
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath = "//h2[contains(text(),'Book Hotel')]")
	private WebElement gettxtbookhotel_name;

	@FindBy(id = "own")
	private WebElement radiobtn_myself;

	@FindBy(id = "user_title")
	private WebElement ddn_sa_title;

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement txt_firstname;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement txt_lastname;

	@FindBy(name = "phone")
	private WebElement txt_ponenum;

	@FindBy(id = "user_email")
	private WebElement txt_email;

	@FindBy(id = "gst")
	private WebElement check_btn_GST;

	@FindBy(id = "gst_registration")
	private WebElement txt_reg_gst;

	@FindBy(id = "company_name")
	private WebElement txt_compant_name;

	@FindBy(id = "company_address")
	private WebElement txt_company_add;

	@FindBy(id = "step1next")
	private WebElement btn_next;

	@FindBy(id = "late")
	private WebElement btn_late;

	@FindBy(id = "other_request")
	private WebElement txt_request;

	@FindBy(id = "step2next")
	private WebElement btn_next2;

	@FindBy(xpath = "//div[@class='credit-card pm']")
	private WebElement btn_payment;

	@FindBy(id = "payment_type")
	private WebElement ddn_payment_type;

	@FindBy(id = "card_type")
	private WebElement ddn_cadecom_type;

	@FindBy(id = "card_no")
	private WebElement txt_card_no;

	@FindBy(id = "card_name")
	private WebElement txt_card_name;

	@FindBy(id = "card_month")
	private WebElement ddn_month;

	@FindBy(id = "ddn_month")
	private WebElement ddn_year;

	@FindBy(xpath = "//input[@name='cvv']")
	private WebElement txt_CVV;

	@FindBy(id = "submitBtn")
	private WebElement btn_submit;
	
	@FindBy(id="invalid-payment_type")
	private WebElement cardpaymnetTypeErrormsg;
	
	@FindBy(id="invalid-card_type")
	private WebElement cardTypeErrorMsg;
	
	@FindBy(id="invalid-card_no")
	private WebElement cardNuErrorMsg;
	
	@FindBy(id="invalid-card_name")
	private WebElement cardNameErrorMsg;
	
	@FindBy(id="invalid-card_month")
	private WebElement cardMonthErrorMsg;
	
	@FindBy(id="invalid-cvv")
	private WebElement cardCVVErrorMsg;

	
	public String getBookHotelSuccessmsg() {
		implicitWait();
		String bookHotel_succmsg = elementGetText(gettxtbookhotel_name);
		System.out.println(bookHotel_succmsg);
		return bookHotel_succmsg;
		}
	
	public String getCardNuErrorMsg() {
		String gettxtcardnumberErrormsg = elementGetText(cardNuErrorMsg);
		return gettxtcardnumberErrormsg;
	}
	public String getCardPaymentTypeErrorMsg() {
		String gettxtcardpaymentTypeErrorMsg = elementGetText(cardpaymnetTypeErrormsg);
		return gettxtcardpaymentTypeErrorMsg;
		
	}
	public String getCardTypeErrorMsg() {
		String getTxtCardTypeErrorMsg = elementGetText(cardTypeErrorMsg);
		return getTxtCardTypeErrorMsg;
		
	}
	
	public String getCardNameErrorMsg() {
		String getTxtCardNameErrorMsg = elementGetText(cardNameErrorMsg);
		return getTxtCardNameErrorMsg;
	}
	public String getCardMonthErrorMsg() {
		String getTxtCardMonthErrorMsg = elementGetText(cardMonthErrorMsg);
		return getTxtCardMonthErrorMsg;	
	}
	public String getCardCVVErrorMsg() {
		String getTxtCardCVVErrorMsg = elementGetText(cardCVVErrorMsg);
		return getTxtCardCVVErrorMsg;
	}
	

	public void addGuestDetails(String Select_Salutation,String first_name,String last_name,String Mobile_No,String Email) {
		implicitWait();
		elementClick(radiobtn_myself);
		selectOptionByattribute(ddn_sa_title,Select_Salutation );
		elementSendKeys(txt_firstname, first_name);
		elementSendKeys(txt_lastname, last_name);
		elementSendKeys(txt_ponenum, Mobile_No);
		elementSendKeys(txt_email, Email);
		elementClick(check_btn_GST);
	}
	
	public void addGSTDetails(String Enter_Registration_No, String Enter_Company_Name, String Enter_Company_Address) {
		
		elementSendKeys(txt_reg_gst, Enter_Registration_No);
		elementSendKeys(txt_compant_name, Enter_Company_Name);
		elementSendKeys(txt_company_add, Enter_Company_Address);
		elementClick(btn_next);
		
	}
	
	
	
	public void addSpecialReq(String Request) {
		
		elementClick(btn_late);
		elementSendKeys(txt_request, Request);
		elementClick(btn_next2);
	}
	public void addPaymentDetails(String card_type,String Select_Card,String Card_No,String Card_Name,String Month,String Year,String CVV) {
	
		elementClick(btn_payment);
		selectOptionByText(ddn_payment_type, card_type);
		selectOptionByText(ddn_cadecom_type, Select_Card);
		elementSendKeys(txt_card_no, Card_No);
		elementSendKeys(txt_card_name, Card_Name);
		selectOptionByText(ddn_month, Month);
		elementSendKeys(txt_CVV, CVV);
		implicitWait();
		elementClick(btn_submit);
		
	}
	public void withoutAddPaymentDetails() {
		elementClick(btn_payment);
		elementClick(btn_submit);
	}
	
	
}

