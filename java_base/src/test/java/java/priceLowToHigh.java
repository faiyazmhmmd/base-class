package java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;

public class priceLowToHigh extends BaseClass {
	public void booking() {
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
		
		//selectOptionByIndex(ddn_roomtype, 1);
		for (int i = 1; i < 5; i++) {
			selectOptionByIndex(ddn_roomtype, i);
		}


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
		
	List<WebElement> priceLowToHigh = List_findLocatorByXpath1("(//div[@class='prize']//strong)");
		
		for (WebElement webElement : priceLowToHigh) {
			String priceLH = elementGetText(webElement);
			System.out.println(priceLH);
			List<String> asList = Arrays.asList(priceLH);
			Collections.sort(asList);// (convert in ascending order)
			List<String> dev = new ArrayList<String>(asList);
			List<String> qa = new ArrayList<String>(asList);
			boolean equals = dev.equals(qa);
			System.out.println(equals);
		}
	}
	public static void main(String[] args) {
		priceLowToHigh p=new priceLowToHigh();
		p.booking();
		
		
	}
}
