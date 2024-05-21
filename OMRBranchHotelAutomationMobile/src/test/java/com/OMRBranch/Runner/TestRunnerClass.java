package com.OMRBranch.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features",glue = "com.OMRBranch.Stepdefinition",tags = "@Mobile")

public class TestRunnerClass {

}
