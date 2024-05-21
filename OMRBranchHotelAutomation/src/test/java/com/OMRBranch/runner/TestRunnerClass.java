package com.OMRBranch.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = " @Change1 or @Cancel2", dryRun = false, stepNotifications = true,  glue = "com.OMRBranch.StepDefinition", features = "src\\test\\resources\\Features")

public class TestRunnerClass {

}


