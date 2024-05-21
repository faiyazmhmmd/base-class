package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.Reporting.Reporting_JVMReporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature folder\\omr_login.feature",plugin = {"html:target\\sample.html"},stepNotifications = true,glue = "com.stepdefinition")

public class TestRunner_JVMReport {
	
	@AfterClass
	public static void afterExecution() {
		Reporting_JVMReporting.generateJVMReport(System.getProperty("user.dir")+"\\target\\index2.json");
	}

}
