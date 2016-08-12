package event;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import detail.CheckoutDetail;
import detail.LoginDetail;
import detail.SearchDetail;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.SearchPage;
import util.WaitFor;

public class CheckoutEvent {
	WebDriver driver;
	LoginDetail loginDetail;
	SearchDetail searchDetail;
	CheckoutDetail checkoutDetail;

	LoginPage loginPage;
	SearchPage searchPage;
	CheckoutPage checkoutPage;

	public CheckoutEvent(WebDriver driver, LoginDetail loginDetail, SearchDetail searchDetail,
			CheckoutDetail checkoutDetail) {
		this.driver = driver;
		this.loginDetail = loginDetail;
		this.searchDetail = searchDetail;
		this.checkoutDetail = checkoutDetail;

	}

	public CheckoutEvent(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateLogInForm() {
		loginPage = new LoginPage(driver);

	}

	public void login(LoginDetail loginDetail) {
		loginPage.clickLinkSign();
		waitForEmailTextBoxToAppear();
		loginPage.enterEmailTextbox(loginDetail.getEmail());
		loginPage.enterPassTextbox(loginDetail.getPass());
		loginPage.clickSignButton();

	}

	private void waitForEmailTextBoxToAppear() {
		// TODO Auto-generated method stub
		new WaitFor(driver).presenceOfTheElement(By.id("login-email"));

	}

	public void navigateSearch() {
		searchPage = new SearchPage(driver);
	}

	public void searchProduct(SearchDetail searchDetail) {
		//waitForSearchTextBoxToAppear();
		waitForCloseButtonHidden();
		searchPage.enterSearchTextbox(searchDetail.getSearch());
		searchPage.clickSearchButton();
		searchPage.clickSelectProduct();
		searchPage.clickAddtoCartButton();
		searchPage.clickBuyButton();

	}

	public void navigateCheckout() {
		checkoutPage = new CheckoutPage(driver);
	}

	public void FillCheckoutForm(CheckoutDetail checkoutDetail) {
		checkoutPage.enterFirstNameTextbox(checkoutDetail.getFirstName());
		checkoutPage.enterLastNameTextbox(checkoutDetail.getLastName());
		checkoutPage.enterAddressTextbox(checkoutDetail.getAddress());
		checkoutPage.enterCityTextbox(checkoutDetail.getCity());
		checkoutPage.enterCountryTextbox(checkoutDetail.getCountry());
		checkoutPage.enterFirstNameTextbox(checkoutDetail.getState());
		checkoutPage.enterFirstNameTextbox(checkoutDetail.getPhone());

	}

	private void waitForCloseButtonHidden() {
		// TODO Auto-generated method stub
		new WaitFor(driver).hiddenOfTheElement(By.cssSelector(".ui-dialog-titlebar-close"));
	}
}
