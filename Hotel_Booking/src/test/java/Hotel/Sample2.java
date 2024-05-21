package Hotel;

import org.openqa.selenium.WebElement;

public class Sample2 extends baseclass_selenium{
	
	public void Booking() {
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
		
		WebElement frame_search = findLocatorById("hotelsearch_iframe");
		elementFrame(frame_search);
		WebElement btn_search = findLocatorById("searchBtn");
		btn_search.click();
		
		switchTOParentFrame();
		
		WebElement txt_state = findLocatorById("invalid-state");
		System.out.println(txt_state.getText());
		
		WebElement txt_city = findLocatorById("invalid-city");
		System.out.println(txt_city.getText());
		
		WebElement chick_in = findLocatorById("invalid-check_in");
         System.out.println(chick_in.getText());
         
         WebElement check_out = findLocatorById("invalid-check_out");
         System.out.println(check_out.getText());

       //  WebElement  = findLocatorById("invalid-check_out");
         WebElement adult = findLocatorById("invalid-no_adults");
         System.out.println(adult.getText());
         
         
         
	}

	public static void main(String[] args) {
		
		Sample2 a=new Sample2();
		a.Booking();
	}
}
