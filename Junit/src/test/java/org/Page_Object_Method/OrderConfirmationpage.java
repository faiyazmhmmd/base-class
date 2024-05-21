package org.Page_Object_Method;

import java.io.IOException;

import org.BaseClass.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationpage extends base{
	
	 public OrderConfirmationpage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h5[text()='Order Details']")
    private WebElement txteorderdetail;
	
	@FindBy(xpath="//p[contains(text(),'Order No: ')]")
	private WebElement prordernum;

	
	public String getTxteorderdetail() {
		String txteorderdetailmsg = elementGetText(txteorderdetail);
		return txteorderdetailmsg;
	}
    public WebElement getPrordernum() {
		return prordernum;
	}

   public String ordernum(String sheetname,int rownum,int cellnum) throws IOException, Exception {
  	 String orderid = elementGetText(prordernum);
  	 Thread.sleep(4000);
  	 creatCellAndSetCellData(sheetname, rownum, cellnum, orderid);
		return orderid;
	}


public void Orderconfirmation() {
    	
	
	}
}
