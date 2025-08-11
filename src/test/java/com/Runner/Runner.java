package com.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/com/feature/login.feature",
    glue = "com.stepdefinition",
    plugin = {
        "html:target/testAutomation/test.html",
        "html:target/cucumber-reports.html"
    }
)
public class Runner {
}
