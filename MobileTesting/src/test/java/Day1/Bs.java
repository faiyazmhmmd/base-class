package Day1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Bs extends BaseClass {
	public static void main(String[] args) throws MalformedURLException  {
		
	
		
		// Use Java Client v6.0.0 or above
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("platformVersion", "9.0");
		capabilities.setCapability("deviceName", "Google Pixel 3");
		capabilities.setCapability("app", "bs://e6620ea5f0f3196103dac2e14f866afc62b12bdd");


		//URL url = new URL("http://127.0.0.1:4723/");
		WebDriver driver=new AndroidDriver(new URL("http://faiyazmohammed_svULXf:cESaGsKGP8EpfGVpmceG@hub-cloud.browserstack.com/wd/hub"), capabilities);
		
		
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
      
		driver.quit();
	
	}
}

