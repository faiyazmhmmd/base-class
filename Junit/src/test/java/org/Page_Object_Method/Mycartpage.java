package org.Page_Object_Method;

import org.BaseClass.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mycartpage extends base {
	
     public Mycartpage() {
		PageFactory.initElements(driver, this);
	}
     
    @FindBy(xpath="//h5[text()='My Cart']")
    private WebElement textMycartsuccmsg;
    
    @FindBy(xpath="//div[text()='Delivery Address']")
    private WebElement textdeliveryaddMsg;
    
    @FindBy(xpath="//div[@data-toggle='modal']")
    private WebElement btn_AddAddress;
    
    @FindBy(xpath="//select[@name='address_type']")
    private WebElement ddn_Addrestype;
    
    @FindBy(xpath="(//input[@name='first_name'])[1]")
    private WebElement txtfirstname;
    
    @FindBy(xpath="(//input[@name='last_name'])[1]")
    private WebElement txtlastname;
    
    @FindBy(xpath="//input[@name='mobile']")
    private WebElement txtmapbilenumber;
    
    @FindBy(xpath="//input[@name='apartment']")
    private WebElement txtHouseno;
    
    @FindBy(xpath="//input[@name='address']")
    private WebElement txtAddress;
    
    @FindBy(xpath="//Select[@name='state']")
    private WebElement ddn_selectstate;
    
    @FindBy(xpath="//Select[@name='city']")
    private WebElement ddn_selectcity;
    
    @FindBy(xpath="//input[@name='zipcode']")
    private WebElement txtpincode;
    
    @FindBy(xpath="(//button[@type='submit'])[3]")
    private WebElement btn_saveadd;
    
    @FindBy(id="payment_type")
    private WebElement ddn_selectpaymenttype;
    
    @FindBy(xpath="//label[text()=' Visa ']")
    private WebElement btn_visa;
    
    @FindBy(xpath="//input[@placeholder='Card Number']")
    private WebElement txt_cardnum;
    
    @FindBy(xpath="//select[@id='month']")
    private WebElement DDN_selectmonthofexp;
    
    @FindBy(id="year")
    private WebElement DDN_selectyearofexp;
    
    @FindBy(xpath="//input[@name='cvv']")
    private WebElement txt_cvv;
    
    
    
    @FindBy(xpath="//button[@id='placeOrder']")
    private WebElement btn_placeorder;
    
    
    
    public String getTextMycartsuccmsg() {
		String gettextmycart = elementGetText(textMycartsuccmsg);
		return gettextmycart;
	}

	public String getTextdeliveryaddMsg() {
		String getdeliveryaddmsg = elementGetText(textdeliveryaddMsg);
		return getdeliveryaddmsg;
	}

	
	
	public WebElement getBtn_AddAddress() {
		return btn_AddAddress;
	}
	
	

	public WebElement getDdn_Addrestype() {
		return ddn_Addrestype;
	}

	public WebElement getTxtfirstname() {
		return txtfirstname;
	}

	public WebElement getTxtlastname() {
		return txtlastname;
	}

	public WebElement getTxtmapbilenumber() {
		return txtmapbilenumber;
	}

	public WebElement getTxtHouseno() {
		return txtHouseno;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getDdn_selectstate() {
		return ddn_selectstate;
	}

	public WebElement getDdn_selectcity() {
		return ddn_selectcity;
	}

	public WebElement getTxtpincode() {
		return txtpincode;
	}

	public WebElement getBtn_saveadd() {
		return btn_saveadd;
	}
	

	

	public WebElement getDdn_selectpaymenttype() {
		return ddn_selectpaymenttype;
	}

	public WebElement getBtn_visa() {
		return btn_visa;
	}

	public WebElement getTxt_cardnum() {
		return txt_cardnum;
	}

	public WebElement getDDN_selectmonthofexp() {
		return DDN_selectmonthofexp;
	}

	public WebElement getDDN_selectyearofexp() {
		return DDN_selectyearofexp;
	}

	public WebElement getTxt_cvv() {
		return txt_cvv;
	}

	

	public WebElement getBtn_placeorder() {
		return btn_placeorder;
	}

	public void Mycart(String Addtype,String firstname,String lastname,String mobnum,String housno,String address,String state_attribute,String city_attribute,
			String pin ) throws InterruptedException {
		
		elementClick(btn_AddAddress);
        selectOptionByText(ddn_Addrestype, Addtype);
        elementSendKeys(txtfirstname, firstname);
        elementSendKeys(txtlastname, lastname);
        elementSendKeysJS(txtmapbilenumber, mobnum);
        elementSendKeys(txtHouseno, housno);
        elementSendKeys(txtAddress, address);                                   
        selectOptionByattribute(ddn_selectstate, state_attribute);
        selectOptionByattribute(ddn_selectcity, city_attribute);
        elementSendKeys(txtpincode, pin);
        elementClick(btn_saveadd);
	    }
		
	    public void Mycartpayment(int selectpaymenttype,String cardnum, int selectmonthofcadexp,String selectyearofexp,String cvvnum) throws InterruptedException {
        
		Thread.sleep(3000);
        selectOptionByIndex(ddn_selectpaymenttype, selectpaymenttype);
        elementClick(btn_visa);
        elementSendKeys(txt_cardnum, cardnum);
        selectOptionByIndex(DDN_selectmonthofexp,selectmonthofcadexp );
        selectOptionByattribute(DDN_selectyearofexp,selectyearofexp );
        elementSendKeys(txt_cvv, cvvnum);
		
	    }
        
        public void Mycartplaceorder() {
        	
         elementClick(btn_placeorder);
        
        
	}
    
    
    
    

}
