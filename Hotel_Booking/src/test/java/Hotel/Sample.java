package Hotel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Sample extends baseclass_selenium {

	public void booking() throws InterruptedException {

		browserLaunch("CHROME");
		enterApplnUrl("https://omrbranch.com/");
		maximizeWindow();
		implicitWait();

		findLocatorById("email").sendKeys("faiyazmhmmd@gmail.com");
		findLocatorById("pass").sendKeys("Madurai@123");
		findLocatorByXpath("//button[text()='Login']").click();
		WebElement gettxtwelcome = findLocatorByXpath("//a[@data-testid='username']");
		String Text = elementGetText(gettxtwelcome);
		System.out.println(Text);
		
		findLocatorByXpath("//h3[text()='Hotel Booking']").click();

		WebElement ddn_state = findLocatorById("state");
		selectOptionByText(ddn_state, "Tamil Nadu");
		
		WebElement ddn_city = findLocatorById("city");
		selectOptionByText(ddn_city, "Madurai");

		WebElement ddn_roomtype = findLocatorById("room_type");
		
		selectOptionByIndex(ddn_roomtype, 1);
//		for (int i = 1; i < 5; i++) {
//			selectOptionByIndex(ddn_roomtype, i);
//		}


		WebElement check_in = findLocatorByName("check_in");
		check_in.click();
		findLocatorByXpath("//a[text()='28']").click();

		WebElement check_out = findLocatorByName("check_out");
		check_out.click();
		findLocatorByXpath("//a[text()='30']").click();

		WebElement ddn_no_room = findLocatorById("no_rooms");
		selectOptionByattribute(ddn_no_room, "1");

		WebElement ddn_no_adults = findLocatorById("no_adults");
		selectOptionByIndex(ddn_no_adults, 2);

		WebElement txt_no_child = findLocatorById("no_child");
		elementSendKeys(txt_no_child, "1");

		WebElement frame_search = findLocatorById("hotelsearch_iframe");
		elementFrame(frame_search);
		WebElement btn_search = findLocatorById("searchBtn");
		btn_search.click();
		
		

		WebElement gettxtsearch = findLocatorByXpath("//h5[text()='Select Hotel']");
		String text2 = gettxtsearch.getText();
		System.out.println(text2);

//		WebElement gettxtHotename = findLocatorByXpath("(//div[@class='col-md-5 hotel-suites']//h5)[1]");
//		String text3 = gettxtHotename.getText();
//		System.out.println(text3);
//		
		
		
	//	WebElement getallHotalName = findLocatorByXpath("(//div[@class='col-md-5 hotel-suites']//h5)");
		List<WebElement> locatorByXpath1 = findLocatorByXpath1("(//div[@class='col-md-5 hotel-suites']//h5)");
		
		
			for (WebElement webElement : locatorByXpath1) {
				String text7 = webElement.getText();
				System.out.println(text7);
			}
		
			findLocatorByXpath("//label[text()='Price low to high']").click();
			threadsleep(3000);
			
			List<WebElement> locatorByXpath2 = findLocatorByXpath1("//strong[@class='total-prize']");
			
			
			for (WebElement webElement : locatorByXpath2) {
				String priceLH= webElement.getText();
				System.out.println(priceLH);
				List<String> asList = Arrays.asList(priceLH);
				List<String>qa=new ArrayList<String>(asList);
				System.out.println(qa);
				Collections.sort(asList);// (convert in ascending order)
				List<String> dev = new ArrayList<String>(asList);
				
				System.out.println(dev );
				boolean equals = dev.equals(qa);
				System.out.println(equals);
			}
//		
//		WebElement gettxtprice = findLocatorByXpath("(//strong[@class='total-prize'])[1]");
//		String text4 = gettxtprice.getText();
//		System.out.println(text4);

//		WebElement btn_continue = findLocatorByXpath("(//a[text()='Continue'])[1]");
//		btn_continue.click();
//
//		elementAlert_accept();
//
//		WebElement gettext_bookhotel = findLocatorByXpath("//h2[contains(text(),'Book Hotel')]");
//		String text5 = gettext_bookhotel.getText();
//		System.out.println(text5);
//
//		WebElement radio_myself = findLocatorById("own");
//		radio_myself.click();
//
//		WebElement ddn_sa_title = findLocatorById("user_title");
//		selectOptionByattribute(ddn_sa_title, "Mr");
//
//		WebElement txt_firstname = findLocatorByXpath("//input[@id='first_name']");
//		txt_firstname.sendKeys("Faiyaz");
//
//		WebElement txt_lastname = findLocatorByXpath("//input[@id='last_name']");
//		txt_lastname.sendKeys("Mohammed");
//
//		WebElement txt_phonenu = findLocatorByName("phone");
//		txt_phonenu.sendKeys("9566456117");
//
//		WebElement txt_email = findLocatorById("user_email");
//		txt_email.sendKeys("faiyaz@gmail.com");
//
//		WebElement check_btn_GST = findLocatorById("gst");
//		check_btn_GST.click();
//
//		WebElement txt_reg_gst = findLocatorById("gst_registration");
//		txt_reg_gst.sendKeys("9043592058");
//
//		WebElement txt_compant_name = findLocatorById("company_name");
//		txt_compant_name.sendKeys("Greens Tech OMR Branch");
//
//		WebElement txt_company_add = findLocatorById("company_address");
//		txt_company_add.sendKeys("Thoraipakkam");
//
//		WebElement btn_next = findLocatorById("step1next");
//		btn_next.click();
//
//		WebElement btn_late = findLocatorById("late");
//		btn_late.click();
//
//		WebElement txt_request = findLocatorById("other_request");
//		txt_request.sendKeys("good");
//
//		WebElement btn_next2 = findLocatorById("step2next");
//		btn_next2.click();
//
//		WebElement btn_payment = findLocatorByXpath("//div[@class='credit-card pm']");
//		btn_payment.click();
//
//		WebElement ddn_payment_type = findLocatorById("payment_type");
//		selectOptionByText(ddn_payment_type, "Debit Card");
//
//		WebElement ddn_cade_type = findLocatorById("card_type");
//		selectOptionByText(ddn_cade_type, "Visa");
//
//		WebElement txt_card_no = findLocatorById("card_no");
//		txt_card_no.sendKeys("5555555555552222");
//
//		WebElement txt_card_name = findLocatorById("card_name");
//		txt_card_name.sendKeys("faiyaz");
//
//		WebElement ddn_month = findLocatorById("card_month");
//		selectOptionByText(ddn_month, "July");
//
//		WebElement ddn_year = findLocatorById("ddn_month");
//		selectOptionByText(ddn_year, "2024");
//
//		WebElement txt_cvv = findLocatorById("cvv");
//		txt_cvv.sendKeys("027");
//
//		WebElement btn_submit = findLocatorById("submitBtn");
//		btn_submit.click();
//
//		WebElement order_id = findLocatorByXpath("//h2[@name='booking-code']/strong");
//		String text6 = order_id.getText();
//		System.out.println(text6);
//
//		WebElement conform = findLocatorByXpath("//h2[contains(text(),' Booking ')]");
//		System.out.println(conform.getText());
//
//		WebElement hotalname = findLocatorByXpath("(//div[@class='seccess-box text-center']//strong)[2]");
//		System.out.println(hotalname.getText());
//
//		WebElement btn_tohome = findLocatorByXpath("//button[text()='Go To Home']");
//		btn_tohome.click();
//
//		WebElement gettxtwelcome2 = findLocatorByXpath("//a[contains(text(),'Welcome Faiyaz')]");
//		gettxtwelcome2.click();
//
//		WebElement My_account = findLocatorByXpath("//a[text()='My Account']");
//		My_account.click();
//
//		WebElement gettext_booking = findLocatorByXpath("(//div[@class='col-md-5'])[1]");
//		System.out.println(gettext_booking.getText());
//
//		WebElement order_id2 = findLocatorByXpath("(//div[@class='room-code']//span)[1]");
//		System.out.println(order_id2.getText());
//
//		WebElement hotal_name2 = findLocatorByXpath("(//div[@class='room-code']/following-sibling::h5)[1]");
//		System.out.println(hotal_name2.getText());
//
//		WebElement total_price2 = findLocatorByXpath("(//strong[@class='total-prize'])[1]");
//		System.out.println(total_price2.getText());
//
//		WebElement btn_edit = findLocatorByXpath("(//button[@type='submit'])[1]");
//		btn_edit.click();
//
//		WebElement check_in2 = findLocatorByXpath("//input[contains(@class,'form-control from')]");
//		check_in2.click();
//
//		WebElement edit_date = findLocatorByXpath("//a[contains(text(),'29')]");
//		edit_date.click();
//
//		WebElement btn_Conform = findLocatorByXpath("//button[text()='Confirm']");
//		btn_Conform.click();
//
//		WebElement update_msg = findLocatorByXpath("//li[@class='alertMsg']");
//		System.out.println(update_msg.getText());
//
//		WebElement btn_home = findLocatorByXpath("//span[text()='HOME']");
//		btn_home.click();
//
//		WebElement gettxtwelcome3 = findLocatorByXpath("//a[contains(text(),'Welcome Faiyaz')]");
//		gettxtwelcome3.click();
//
//		WebElement My_account2 = findLocatorByXpath("//a[text()='My Account']");
//		My_account2.click();
//
//		WebElement gettext_booking2 = findLocatorByXpath("(//div[@class='col-md-5'])[1]");
//		System.out.println(gettext_booking2.getText());
//
//		WebElement order_id3 = findLocatorByXpath("(//div[@class='room-code']//span)[1]");
//		System.out.println(order_id3.getText());
//
//		WebElement hotal_name3 = findLocatorByXpath("(//div[@class='room-code']/following-sibling::h5)[1]");
//		System.out.println(hotal_name3.getText());
//
//		WebElement total_price3 = findLocatorByXpath("(//strong[@class='total-prize'])[1]");
//		System.out.println(total_price3.getText());
//
//		WebElement btn_canael = findLocatorByXpath("//a[contains(text(),'Cancel')]");
//		btn_canael.click();
//
//		elementAlert_accept();
//
//		WebElement delet_msg = findLocatorByXpath("//li[@class='alertMsg']");
//		System.out.println(delet_msg.getText());

	}

	public static void main(String[] args) throws InterruptedException {

		Sample a = new Sample();
		a.booking();
	}
}
