package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = ".log-in")
	private WebElement linkSign;

	@FindBy(id = "login-email")
	private WebElement txtEmail;

	@FindBy(id = "login-password")
	private WebElement txtPass;

	@FindBy(css = "button.submit:nth-child(1)")
	private WebElement btnSign;

	public void clickLinkSign() {
		linkSign.click();
	}

	public void enterEmailTextbox(String text) {
		txtEmail.clear();
		txtEmail.sendKeys(text);

	}

	public void enterPassTextbox(String text) {
		txtPass.clear();
		txtPass.sendKeys(text);

	}

	public void clickSignButton() {
		btnSign.click();
	}

}
