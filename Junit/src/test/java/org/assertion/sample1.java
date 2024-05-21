package org.assertion;

import org.checkerframework.checker.units.qual.t;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
	@Test
	public void login() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");

		WebElement txtlogin = driver.findElement(By.xpath("//input[@name='email']"));
		txtlogin.sendKeys("faiayazmhmmd@gmail.com");
		String login_txt = txtlogin.getAttribute("value");
       Assert.assertEquals("verify username", "faiayazmhmmd@gmail.com", login_txt);
       
       WebElement txt_pass = driver.findElement(By.xpath("//input[@name='pass']"));
       txt_pass.sendKeys("Madurai@123");
       String text = txt_pass.getText();
       Assert.assertEquals("verify password", "Madurai@123", text);
       
       WebElement  btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
       btnLogin.click();
       
//       txtLoginErrormessage.click();
//       String text2 = txtLoginErrormessage.getText();
//       text2.con
       
       
       
	}

}
