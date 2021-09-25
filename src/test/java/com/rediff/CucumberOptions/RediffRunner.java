package com.rediff.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications = true,
		features="src/test/java/com/rediff/features",
     glue="com.rediff.stepDefinations",plugin = {"json:target/cucumber-html-report","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
     monochrome=true
		)
public class RediffRunner extends AbstractTestNGCucumberTests {
	
	

}