package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"html:target/cucmber"},
		features = "src/features",
		glue = "src/test/java/steps")

public class CuckeRunner {

}
