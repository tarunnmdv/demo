package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ecare {

	WebDriver driver;

	Scenario scenario;

	int tarn;
	
	@Before({ "@Registration1,@Registration3" })
	public void testSetup(Scenario scenario) {
		this.scenario = scenario;
	}

	@After({ "@Registration1,@Registration3" })
	public void tearDown(Scenario scenario) {
		scenario.write("Finished scenario");
		if (scenario.isFailed()) {
			scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
		}
		System.out.println("Test Environment Destroyed ");
		System.out.println("----------------------------------------------------------------------");

	}

	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.ie.driver",
				"C:\\Intel\\Tarun\\new code for serenity\\digitalx.ui.test.automation\\lib\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://tcc1-www.vodafone.co.uk/myvodafone/");
		driver.manage().window().maximize();

	}

	@When("^user enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Throwable {
		driver.findElement(By.id("userId")).sendKeys("DNU_ECARE_7000287935");
		driver.findElement(By.id("passwordLogin")).sendKeys("testing1");
		driver.findElement(By.id("T:oc_3294087070region1:0:logFrm:signin1")).click();
	}

	@Then("^User should click on NOT NOW button$")
	public void user_should_click_on_NOT_NOW_button() throws Throwable {
		long newWait = 0;
		WebDriverWait wait = new WebDriverWait(driver, newWait);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='portlet_easyLogin sim']")));
		String myWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[contains(text(),'Not now')]")).click();
	}

	@When("^User click on account settings link$")
	public void user_click_on_account_settings_link() throws Throwable {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='leftHandNav']/li[7]/a")).click();
	}

	@When("^User click on login details link$")
	public void user_click_on_login_details_link() throws Throwable {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='subNav']/li[1]/a")).click();
	}

	@When("^User click on change button for PIN change$")
	public void user_click_on_change_button_for_PIN_change() throws Throwable {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='T:oc_7337787611region1:0:editPin']")).click();
	}

	@When("^User enter New PIN number$")
	public void user_enter_New_PIN_number() throws Throwable {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='T:oc_7337787611region1:new_PIN']")).sendKeys("5678");
	}

	@Then("^User Confirm PIN number$")
	public void user_Confirm_PIN_number() throws Throwable {

		driver.findElement(By.xpath("//*[@id='T:oc_7337787611region1:confirm_PIN']")).sendKeys("5678");
	}

	@When("^User click on save button$")
	public void user_click_on_save_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id='T:oc_7337787611region1:0:submit_Pin']")).click();
	}

	@When("^PIN saved updated message reflected$")
	public void pin_saved_updated_message_reflected() throws Throwable {
		Thread.sleep(10000);
		String updatemsg = driver.findElement(By.xpath("//*[@id='T:oc_7337787611region1:0:j_id__ctru36pc2']/div/p"))
				.getText();
		Assert.assertEquals(updatemsg, "You've now updated your details");

	}

	@Then("^User logout to application$")
	public void user_logout_to_application() throws Throwable {
		long newWait = 0;
		WebDriverWait wait = new WebDriverWait(driver, newWait);
		wait = new WebDriverWait(driver, newWait);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='MUmyAccount']")));
		Actions actions = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.xpath("//li[@id='MUmyAccount']"));
		actions.moveToElement(mainMenu).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='MUmyAccountOptions']/li[5]/a/span")).click();
		// wait = new WebDriverWait(driver, newWait);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Log
		// in now')]")));
	}

	@Then("^User close the browser$")
	public void user_close_the_browser() throws Throwable {
		Thread.sleep(5000);
		driver.quit();
	}

}