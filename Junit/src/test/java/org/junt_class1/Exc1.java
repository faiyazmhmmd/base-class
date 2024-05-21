package org.junt_class1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exc1 {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void befoerclass() {
	    driver=new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		}
	@Before
	public  void beforemethod() throws IOException {
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		System.out.println(file);
		File file1=new File("D:\\maven\\maven work spsce\\Junit\\screenshot\\omr.png");
		FileUtils.copyFile(file, file1);
		}
	@Before
	public void beforemethod1() {
		long time = System.currentTimeMillis();
		System.out.println("time to take the browser to open:"+time);
	}
	@After
	public void aftermethod1() {
		long time2 = System.currentTimeMillis();
		System.out.println("time to take the browser to login:"+time2);
	}
	@AfterClass
	public static void afterclass() {
		driver.quit();
		}
	@After
	public void aftermethod() throws IOException {
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File file2 = screenshot.getScreenshotAs(OutputType.FILE);
		System.out.println(file2);
		File file3=new File("D:\\maven\\maven work spsce\\Junit\\screenshot\\omr2.png");
		FileUtils.copyFile(file2, file3);
		
	}
	@Test
	public void login() {
		
		WebElement txt_login = driver.findElement(By.xpath("//input[@name='email']"));
		txt_login.sendKeys("faiyazmhmmd@gmail.com");
		WebElement txt_pass = driver.findElement(By.xpath("//input[@name='pass']"));
		txt_pass.sendKeys("Madurai@123");
		WebElement btn_login = driver.findElement(By.xpath("//button[@type='submit']"));
		btn_login.click();
	}
	



}
