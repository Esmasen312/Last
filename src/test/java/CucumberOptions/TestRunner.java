package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="scr/test/java/features",
		glue="StepDefinitions")
		

		

public class TestRunner {
	
}
