package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(strict = true, features = { "features" }, glue = { "stepdefinations" }, plugin = {
		"html:target/myreport" })
public class TestRunner2 {

}
