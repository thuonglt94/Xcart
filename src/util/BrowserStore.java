package util;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserStore {
	public static WebDriver driver;

	public static WebDriver getBrowser() throws IOException {
		String browserType = PropertiesStore.getProperty("browserType");
		switch (browserType) {
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			String chrome_path = PropertiesStore.getProperty("chrome_path");
			System.setProperty("webdriver.chrome.driver", chrome_path);
			driver = new ChromeDriver();
			break;
		case "IE":
			String ie_path = PropertiesStore.getProperty("ie_path");
			System.setProperty("webdriver.ie.driver", ie_path);
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			driver = new FirefoxDriver();
		}
		return driver;

	}
}
