package com.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefClass_CucumberHook {
	WebDriver driver;
	

	

	@Given("user is on the Facebook page")
	public void user_is_on_the_facebook_page() {
		
	}
	@When("user enter username and password")
	public void user_enter_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("faiyaz@gamil.com");
		driver.findElement(By.id("pass")).sendKeys("madurai@123");
	}
	@When("user Enter the login button")
	public void user_enter_the_login_button() {
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
	@Then("user should verify the success login message")
	public void user_should_verify_the_success_login_message() {
		
	}



}
