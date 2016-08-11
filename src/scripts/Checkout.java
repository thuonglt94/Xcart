package scripts;

import org.testng.annotations.Test;

import builder.CheckoutDetailBuilder;
import builder.LoginDetailBuilder;
import builder.SearchDetailBuilder;
import detail.CheckoutDetail;
import detail.LoginDetail;
import detail.SearchDetail;
import event.CheckoutEvent;

public class Checkout {
	@Test
	public class ChatFacebook extends ScriptBase {
		public void test_Checkout() throws InterruptedException {
			LoginDetailBuilder loginDetailBuilder = new LoginDetailBuilder();
			SearchDetailBuilder searchDetailBuilder = new SearchDetailBuilder();
			CheckoutDetailBuilder checkoutDatailBuilder = new CheckoutDetailBuilder();

			loginDetailBuilder.withEmail("huonggg@gmail.com").withPass("1");
			searchDetailBuilder.withSearch("iphone");
			checkoutDatailBuilder.withFirstName("aa").withLastName("dgh").withAddress("dgtbhb").withCity("rbrb").withCountry("United States")
					.withState("California").withPhone("145");

			LoginDetail loginDetail = loginDetailBuilder.build();
			SearchDetail searchDetail = searchDetailBuilder.build();
			CheckoutDetail checkoutDetail = checkoutDatailBuilder.build();

			CheckoutEvent user = new CheckoutEvent(driver, loginDetail, searchDetail, checkoutDetail);

			given(user).navigateLogInForm();
			and(user).login(loginDetail);
			and(user).navigateSearch();
			when(user).searchFriend();
			and(user).navigateCheckout();
			then(user).FillCheckoutForm();

		}
	}
}