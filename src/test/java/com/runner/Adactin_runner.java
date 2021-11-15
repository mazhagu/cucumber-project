package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.project.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\com\\feature", glue="com.stepdefinition",
monochrome=true,
//dryRun=true,
strict=false,
plugin = {
		"pretty", "html:Report","com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html" })

public class Adactin_runner {
	
public static WebDriver driver;

@BeforeClass
public static void setup() {
	
	driver=BaseClass.to_browser_launch();
}
}



