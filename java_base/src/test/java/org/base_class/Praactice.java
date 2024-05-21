package org.base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Praactice {
	
	WebDriver driver;
	private void browser() {
		driver=new ChromeDriver();
	}
	 private void enterAppUrl(String Url) {
		 browser();
		 driver.get(Url);
	 }
	public static void main(String[] args) {
		
		Praactice a=new Praactice();
		a.enterAppUrl("https://omrbranch.com/");

	}

}
