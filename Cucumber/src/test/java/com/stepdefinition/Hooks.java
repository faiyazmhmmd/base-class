package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseClass.baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks  extends baseclass{
	WebDriver driver;
	@Before
	public void beforeScenario() {
		System.out.println("base......");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
	}
	@After
	public void afterScenario(Scenario senario ) {
		System.out.println("after...........");
		senario.attach(screenShotByte(),"image/png", "Senario");
		deleteCookies();
		driver.close();
	}

}
