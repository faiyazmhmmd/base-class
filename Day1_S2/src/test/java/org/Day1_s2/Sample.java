package org.Day1_s2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("faiyaz");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		

	}

}
