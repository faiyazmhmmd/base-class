package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target\\index.html", "json:target\\index2.json",
		"junit:target\\index.xml" },stepNotifications = true, dryRun = false, monochrome = true, glue = "com.stepdefinition", features = "src\\test\\resources\\Feature folder\\omr_login.feature")

public class TestRunnerClass_amazon {

}
