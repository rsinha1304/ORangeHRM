package com.Runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/java/com/feature/login.feature",
	    glue = "com.stepdefinition",
	    plugin = {
	        "html:target/testAutomation/test.html",
	        "html:target/cucumber-reports.html"
	    }
		)

public class Runner_TestNG extends AbstractTestNGCucumberTests{

}
