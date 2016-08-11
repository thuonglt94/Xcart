package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "#substring-default")
	private WebElement txtSearch;

	@FindBy(css = ".simple-search-box .btn.regular-button.submit-button.submit")
	private WebElement btnSearch;

	@FindBy(css = ".product.productid-37.product-added.ui-draggable")
	private WebElement btnProduct;

	@FindBy(css = ".btn.regular-button.regular-main-button.add2cart.submit")
	private WebElement btnAddtoCart;

	@FindBy(css = ".pp-ec-button")
	private WebElement btnBuy;

	public void enterSearchTextbox(String text) {
		txtSearch.clear();
		txtSearch.sendKeys(text);
	}

	public void clickSearchButton() {
		btnSearch.click();
	}

	public void clickSelectProduct() {
		btnProduct.click();
	}

	public void clickAddtoCartButton() {
		btnAddtoCart.click();
	}

	public void clickBuyButton() {
		btnBuy.click();
	}
}
