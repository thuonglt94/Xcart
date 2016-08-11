package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "#shippingaddress-firstname")
	private WebElement txtFirstName;

	@FindBy(css = "#shippingaddress-lastname")
	private WebElement txtLastName;

	@FindBy(css = "#shippingaddress-street")
	private WebElement txtAddress;

	@FindBy(css = "#shippingaddress-city")
	private WebElement txtCity;

	@FindBy(css = "#shippingaddress-country-code option:nth-child(9")
	private WebElement checkboxCountry;

	@FindBy(css = "#shippingaddress-state-id option:nth-child(6)")
	private WebElement checkboxState;

	@FindBy(css = "#shippingaddress-phone")
	private WebElement txtPhone;

	@FindBy(css = ".btn.regular-button.regular-main-button.place-order.submit")
	private WebElement btnPlaceOrder;

	public void enterFirstNameTextbox(String text) {
		txtFirstName.clear();
		txtFirstName.sendKeys(text);
	}

	public void enterLastNameTextbox(String text) {
		txtLastName.clear();
		txtLastName.sendKeys(text);
	}

	public void enterAddressTextbox(String text) {
		txtAddress.clear();
		txtAddress.sendKeys(text);
	}

	public void enterCityTextbox(String text) {
		txtCity.clear();
		txtCity.sendKeys(text);
	}

	public void enterCountryTextbox(String text) {
		checkboxCountry.clear();
		checkboxCountry.sendKeys(text);
	}

	public void enterStateTextbox(String text) {
		checkboxState.clear();
		checkboxState.sendKeys(text);
	}

	public void enterPhoneTextbox(String text) {
		txtPhone.clear();
		txtPhone.sendKeys(text);
	}

	public void clickPlaceOrderButton() {
		btnPlaceOrder.click();
	}

}
