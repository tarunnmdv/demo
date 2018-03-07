package runner;

import java.io.File;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "features" }, glue = { "stepdefinations" }, format = { "pretty",
		"html:target/Destination" }, plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:C:\\Intel\\Tarun\\cucumber second demo\\cucmber-jvm-demo\\target\\extends report\\report.html" })
public class TestRunner {

	@AfterClass
	public static void reportSetup() {
		Reporter.loadXMLConfig(new File("src/extent-config.xml"));

		Properties p = System.getProperties();
		p.list(System.out);

		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("64 Bit", "Windows 10");
		Reporter.setSystemInfo("3.4.0", "Selenium");
		Reporter.setSystemInfo("1.8.0_77", "Java Version");
		Reporter.setTestRunnerOutput("Cucumber JUnit Test Runner");
	}
}
