  package Day1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Sample extends BaseClass {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		initial();
		implicitWait(10);

		WebElement txt_login = driver.findElement(By.xpath("//*[@resource-id='login_email_input']"));
		txt_login.sendKeys("faiyazmhmmd@gmail.com");

		WebElement txt_pass = driver.findElement(By.xpath("//*[@resource-id='login_password_input']"));
		txt_pass.sendKeys("Madurai@123");

		WebElement btn_login = driver.findElement(By.xpath("//*[@resource-id='login_button']"));
		btn_login.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement gettxt_welcome = driver.findElement(By.xpath("//*[@resource-id='header_welcome']"));
		System.out.println(gettxt_welcome.getText());

		driver.findElement(By.xpath("//*[@resource-id='search_select_state']")).click();

		driver.findElement(By.xpath("//*[@text='Andhra Pradesh']")).click();

		driver.findElement(By.xpath("//*[@text='Select City']")).click();

		driver.findElement(By.xpath("//*[@text='Tirupati']")).click();

		driver.findElement(By.xpath("//*[@text='Select Room Type']")).click();

		driver.findElement(By.xpath("//*[@text='Standard']")).click();

		driver.findElement(By.xpath("//*[@resource-id='search_select_checkin']")).click();

		driver.findElement(By.xpath("//*[@text='22']")).click();

		driver.findElement(By.xpath("//*[@text='OK']")).click();

		driver.findElement(By.xpath("//*[@resource-id='search_select_checkout']")).click();

		driver.findElement(By.xpath("//*[@text='24']")).click();

		driver.findElement(By.xpath("//*[@text='OK']")).click();

		driver.findElement(By.xpath("//*[@text='No. Of Room']")).click();

		driver.findElement(By.xpath("//*[@text='1-One']")).click();

		driver.findElement(By.xpath("//*[@text='No. Of Adults']")).click();

		driver.findElement(By.xpath("//*[@text='1-One']")).click();

		WebElement no_child = driver.findElement(By.xpath("//*[@resource-id='search_no_of_children']"));
	
		no_child.sendKeys("1");

		driver.findElement(By.xpath("//*[@resource-id='search_button']")).click();
		
		WebElement txtgetSelectmsg = driver.findElement(By.xpath("//*[@resource-id='select_hotel_text']"));
		System.out.println(txtgetSelectmsg.getText());
		
		Thread.sleep(3000);
		
		swipeDown();
	    
	    WebElement continue_btn = driver.findElement(By.xpath("//*[@resource-id='hotel_continue_button']"));
	    continue_btn.click();
	    
	    WebElement alret_ok = driver.findElement(By.xpath("//*[@text='OK']"));
	    alret_ok.click();
	    
	    WebElement gettxt_bookHotel= driver.findElement(By.xpath("//*[@resource-id='book_hotel_text']"));
	    System.out.println(gettxt_bookHotel.getText());
	    
	    implicitWait(30);
	    swipeDown();
	    
	    WebElement MySelf_radio = driver.findElement(By.xpath("(//*[@resource-id='book_hotel_booking_for'])[2]"));
	    MySelf_radio.click();
	    
	 //   Thread.sleep(4000);
	    implicitWait(30);
	    swipeDown();
	    
	    WebElement ddn_salutation = driver.findElement(By.xpath("//*[@text='Select Salutation']"));
	    ddn_salutation.click();
	    
	    WebElement select_Mr = driver.findElement(By.xpath("//*[@text='Mr.']"));
	    select_Mr.click();
	    
	    WebElement txt_firstname = driver.findElement(By.xpath("//*[@resource-id='book_hotel_first_name']"));
	    txt_firstname.sendKeys("faiyaz");
	    
	    WebElement txt_lastname = driver.findElement(By.xpath("//*[@resource-id='book_hotel_last_name']"));
	    txt_lastname.sendKeys("mohammed");
	    
	    WebElement txt_mobileno = driver.findElement(By.xpath("//*[@resource-id='book_hotel_mobile_no']"));
	    txt_mobileno.sendKeys("9566456117");
	    
	    WebElement txt_email = driver.findElement(By.xpath("//*[@resource-id='book_hotel_email']"));
	    txt_email.sendKeys("faiyaz@gmail.com");
	    
	    WebElement checkbox_GST = driver.findElement(By.xpath("//*[@text='Enter GST Details (Optional)']"));
	    checkbox_GST.click();
	    
	    implicitWait(30);
	    swipeDown();
	    
	    implicitWait(30);
	    
	    WebElement txt_gstreg = driver.findElement(By.xpath("//android.widget.EditText[@content-desc='book_hotel_registration']"));
	    txt_gstreg.sendKeys("9043592058");
	    
	    WebElement txt_gstcom = driver.findElement(By.xpath("//android.widget.EditText[@content-desc='book_hotel_company_name']"));
	    txt_gstcom.sendKeys("Greens Tech OMR Branch");
	    
	    WebElement txt_gstadd = driver.findElement(By.xpath("//android.widget.EditText[@content-desc='book_hotel_company_address']"));
	    txt_gstadd.sendKeys("Thoraipakkam");
	    
	    driver.findElement(By.xpath("//*[@resource-id='book_hotel_next_button']")).click();
	    
	    WebElement btn_Smok_room = driver.findElement(By.xpath("//*[@text='Smoking Room']"));
	    btn_Smok_room.click();
	    
	    WebElement txt_Request= driver.findElement(By.xpath("(//*[@resource-id='book_hotel_any_other_request'])[2]"));
	    txt_Request.sendKeys("good");
	    
	    driver.findElement(By.xpath("//*[@resource-id='book_hotel_next_button']")).click();
	    	
	    Thread.sleep(5000);
	    
//	    WebDriverWait wa=new WebDriverWait(driver, Duration.ofSeconds(30));
//	    
//	    WebElement progress = driver.findElement(By.xpath("//android.widget.ProgressBar"));
//
//        wa.until(ExpectedConditions.invisibilityOf(progress));
        
        WebElement btn_card = driver.findElement(By.xpath("//*[@text='Credit/Debit/ATM Card']"));
	    btn_card.click();
	}

}
