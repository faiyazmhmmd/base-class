package com.stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefClass_2Dwithout_header {
	WebDriver driver;

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When("User login")
	public void user_login(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>> emp = dataTable.asLists();
	    List<String> list = emp.get(2);
	    String a1 = list.get(0);
	    String a2 = list.get(1);
	    
		driver.findElement(By.id("email")).sendKeys(a1);
		driver.findElement(By.id("pass")).sendKeys(a2);
	}
	@Then("Should Verify the login success msg")
	public void should_verify_the_login_success_msg() {
	    
	}




}
