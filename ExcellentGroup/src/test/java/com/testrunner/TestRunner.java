package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		
		features="CucumberFeatute",
		glue="com.stepdefinition"
		
		)
		
	public class TestRunner extends AbstractTestNGCucumberTests{

}
