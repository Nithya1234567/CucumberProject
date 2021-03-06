package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources"}, glue = {"com.stepdefinition"}, plugin={"json:src\\test\\resources\\Reporting\\Cucumber.json"})
public class TestRunnerClass {
	@AfterClass
	public static void afterClass()
	{
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reporting\\Cucumber.json");
	}
	
	

}
