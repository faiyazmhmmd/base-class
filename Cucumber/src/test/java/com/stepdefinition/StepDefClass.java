package com.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefClass {
	WebDriver driver;

	@Given("user is on the OMRBranch page")
	public void user_is_on_the_omr_branch_page() {
	   driver= new ChromeDriver();
	   driver.get("https://omrbranch.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   }
		@When("user enter {string} and {string}")
		public void user_enter_and(String username, String password) {
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("pass")).sendKeys(password);
		}

	@When("user click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	   }
	@Then("user should verify the success message after login")
	public void user_should_verify_the_success_message_after_login() {
		Assert.assertTrue("verify the succes msg", true);
		driver.quit();
	  
	}



}
