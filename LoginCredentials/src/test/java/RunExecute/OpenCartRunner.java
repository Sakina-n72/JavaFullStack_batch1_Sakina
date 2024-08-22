package RunExecute;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/Batch1.feature",
glue={"StepDefinition"})
public class OpenCartRunner {
	
}
