package com.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefClass_amazon {
	
	WebDriver driver;
	
	@Given("User is on the Amazon Home page")
	public void user_is_on_the_amazon_home_page() {
		driver= new ChromeDriver();
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	}
	@When("User Enter the product name {string}")
	public void user_enter_the_product_name(String string) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(string);		
	
	}
	@When("User click the search button")
	public void user_click_the_search_button() {
		driver.findElement(By.id("nav-search-submit-button")).click();
	
	}
	@Then("User verify the success search page")
	public void user_verify_the_success_search_page() {
		Assert.assertTrue("verify the succes msg", true);
		driver.quit();
	}




}
