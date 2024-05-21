package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications = true,dryRun = false,glue = "com.stepdefinition",features = "src\\test\\resources\\Feature folder\\FB_2Dwith_Header_asMaps.feature")
public class TesstRunner_DataTable {

}
