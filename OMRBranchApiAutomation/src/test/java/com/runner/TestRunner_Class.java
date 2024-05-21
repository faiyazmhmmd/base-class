package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.api.Reports.Reporting_JVMReporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications = true,plugin ="json:target\\index2.json",tags = "@Login or @State or @City or @Address or @Search or @Changepic",glue = "com.api.StepDefinition", features = "src\\test\\resources\\feature")
public class TestRunner_Class {
	
	
	@AfterClass
	public static void afterExecution() {
		Reporting_JVMReporting.generateJvmReport(System.getProperty("user.dir")+"\\target\\index2.json");
	}

}
																																								