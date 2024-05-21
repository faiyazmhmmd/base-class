package org.Page_Object_Method;



import org.BaseClass.base;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


//Pagefactor
public class Grocery_POM extends base {



	@BeforeClass
	public static void beforeclass() {
		browserLaunch_static("CHROME");
		enterApplnUrl_static("https://omrbranch.com/");
		maximizeWindow_static();
		implicitWait_static();

	}

	 @AfterClass
	 public static void Afterclass() {
	 closeCurrentWindow_static();
													
	 }

	@Test
	public void orde() throws Exception {

		// 1.login
		LoginPage l = new LoginPage();
		l.Login(getcellData("grocery", 1, 0), getcellData("grocery", 1, 1));

		// 2.productSearch
		SearchProductPage s = new SearchProductPage();

		Thread.sleep(1000);

		Assert.assertEquals("verify logins msg", getcellData("verificationpage", 1, 0), s.getTxtLoginSuccessMsg());
        s.elementcart();
		s.productsearch(getcellData("grocery", 1, 2));

		// product list
		ProductListingPage p = new ProductListingPage();

		Assert.assertEquals("verify Search result", getcellData("verificationpage", 1, 1), p.getTxtsearchnuts());

		p.addProduct();

		// My cart page
		Mycartpage m = new Mycartpage();

		Assert.assertEquals("verify My cart succes msg", getcellData("verificationpage", 1, 2),
				m.getTextMycartsuccmsg());

		Assert.assertEquals("verify Delivery Adriess msg success", getcellData("verificationpage", 1, 3),
				m.getTextdeliveryaddMsg());

		m.Mycart("Work ", getcellData("grocery", 1, 3), getcellData("grocery", 1, 4), getcellData("grocery", 1, 5),
				getcellData("grocery", 1, 6), getcellData("grocery", 1, 7), "35", "3659", getcellData("grocery", 1, 8));
		
		m.Mycartpayment(1, getcellData("grocery", 1, 9), 2, "2027", getcellData("grocery", 1, 10));
		
		m.Mycartplaceorder();

		// orderconform
		OrderConfirmationpage o = new OrderConfirmationpage();

		Assert.assertEquals("verify order details msg", getcellData("verificationpage", 1, 4), o.getTxteorderdetail());
		
		o.ordernum("grocery", 1, 11);
		o.Orderconfirmation();

	}

}
