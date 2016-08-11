package event;

import org.openqa.selenium.WebDriver;

import detail.CheckoutDetail;
import detail.LoginDetail;
import detail.SearchDetail;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.SearchPage;

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
		loginPage.enterEmailTextbox(loginDetail.getEmail());
		loginPage.enterPassTextbox(loginDetail.getPass());
		loginPage.clickSignButton();
	}

	public void navigateSearch() {
		searchPage = new SearchPage(driver);
	}

	public void searchFriend() throws InterruptedException {
		Thread.sleep(3000);
		searchPage.enterSearchTextbox(searchDetail.getSearch());
		searchPage.clickSearchButton();
		searchPage.clickSelectProduct();
		searchPage.clickAddtoCartButton();
		searchPage.clickBuyButton();

	}

	public void navigateCheckout() {
		checkoutPage = new CheckoutPage(driver);
	}

	public void FillCheckoutForm() {
		checkoutPage.enterFirstNameTextbox(checkoutDetail.getFirstName());
		checkoutPage.enterLastNameTextbox(checkoutDetail.getLastName());
		checkoutPage.enterAddressTextbox(checkoutDetail.getAddress());
		checkoutPage.enterCityTextbox(checkoutDetail.getCity());
		checkoutPage.enterCountryTextbox(checkoutDetail.getCountry());
		checkoutPage.enterFirstNameTextbox(checkoutDetail.getState());
		checkoutPage.enterFirstNameTextbox(checkoutDetail.getPhone());

	}
}
