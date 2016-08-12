package scripts;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import event.CheckoutEvent;
import util.BrowserStore;
import util.LogStore;

public class ScriptBase {
	WebDriver driver;

	@BeforeTest
	public void setup() throws IOException {
		driver = BrowserStore.getBrowser();
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

	@AfterMethod(alwaysRun = true)
	public void teardown(ITestResult result) {
		captureScreenShotInCaseOfFailure(result);
		// close the browser
		driver.close();

	}

	protected void captureScreenShotInCaseOfFailure(ITestResult result) {
		if (result.isSuccess()) {
			return;
		}
		String screenShotFolder = "screenshots";
		File screenShotSourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			createFolder(screenShotFolder);
			Date now = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
			String format = formatter.format(now);
			String fileName = result.getMethod().getMethodName() + format;
			File screenShotTargetFile = getTargetFile(screenShotFolder, fileName, "png");
			FileUtils.copyFile(screenShotSourceFile, screenShotTargetFile);
		} catch (IOException e) {
			LogStore.logMessage(e.getMessage());
		}
	}

	private void createFolder(String folderName) throws IOException {
		if (!(new File(folderName).exists()))
			new File(folderName).mkdir();
	}

	private File getTargetFile(String folderName, String fileName, String ext) throws IOException {
		String rootPath = new File(".").getCanonicalPath();
		String fullPath = String.format("%s//%s//%s.%s", rootPath, folderName, fileName, ext);
		return new File(fullPath);
	}

}
