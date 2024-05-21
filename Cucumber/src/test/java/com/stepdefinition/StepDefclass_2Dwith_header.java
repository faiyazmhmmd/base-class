package com.stepdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefclass_2Dwith_header {

	WebDriver driver;

	@Given("User on the login page")
	public void user_on_the_login_page() {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@When("User login FB account")
	public void user_login_fb_account(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> emp = dataTable.asMaps();
		Map<String, String> s = emp.get(3);
		String a1 = s.get("username");
		String a2 = s.get("password");
		driver.findElement(By.id("email")).sendKeys(a1);
		driver.findElement(By.id("pass")).sendKeys(a2);
	}

	@Then("Should Verify the after login success msg")
	public void should_verify_the_after_login_success_msg() {

	}

}
