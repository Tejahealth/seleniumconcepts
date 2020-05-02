package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(monochrome = true,

features = { "src/test/java/features" }, 

glue = { "cucumber_BDD" },

tags = { "@NegativeTest, @Positivetest" },

dryRun = false,

plugin={"pretty", "html:test-output"})


public class runner {

}
