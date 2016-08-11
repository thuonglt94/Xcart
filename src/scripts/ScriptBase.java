package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import event.CheckoutEvent;

public class ScriptBase {
	WebDriver driver;

	@BeforeTest
	public void setup() {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/xcart/");

	}

	protected <T extends CheckoutEvent> T given(T dsl) {
		return dsl;
	}

	protected <T extends CheckoutEvent> T when(T dsl) {
		return dsl;
	}

	protected <T extends CheckoutEvent> T and(T dsl) {
		return dsl;
	}

	protected <T extends CheckoutEvent> T then(T dsl) {
		return dsl;
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
