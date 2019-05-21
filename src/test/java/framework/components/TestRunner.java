package framework.components;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/features",
		tags = {"@data"},
		glue = {"framework.stepdefinitions"}, 
		monochrome=true,
		plugin= {"json:target/Reports/cucumber.json","pretty:target/Reports/cucumber-pretty.txt","html:target/Reports"}
		)
public class TestRunner {
	
}