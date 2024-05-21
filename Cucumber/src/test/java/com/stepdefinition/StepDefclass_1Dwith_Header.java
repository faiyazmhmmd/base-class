package com.stepdefinition;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefclass_1Dwith_Header {

	WebDriver driver;

	@Given("user on amazon page")
	public void user_is_on_amazon_page() {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	@When("user search given product")
	public void user_search_product(io.cucumber.datatable.DataTable dataTable) {
		
		Map<String, String> emp = dataTable.asMap();
		String string = emp.get("Laptop");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(string,Keys.ENTER);


	}
	@Then("user should verify given product listed Successfully")
	public void user_should_verify_all_product_listed_successfully() {


	}




}
