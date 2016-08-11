package builder;

import detail.CheckoutDetail;

public class CheckoutDetailBuilder {
	private String firstName;

	private String lastName;

	private String address;

	private String city;

	private String country;

	private String state;

	private String phone;

	public CheckoutDetailBuilder withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public CheckoutDetailBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public CheckoutDetailBuilder withAddress(String address) {
		this.address = address;
		return this;
	}

	public CheckoutDetailBuilder withCity(String city) {
		this.city = city;
		return this;
	}

	public CheckoutDetailBuilder withCountry(String country) {
		this.country = country;
		return this;
	}

	public CheckoutDetailBuilder withState(String state) {
		this.state = state;
		return this;
	}

	public CheckoutDetailBuilder withPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public CheckoutDetail build() {
		return new CheckoutDetail(firstName, lastName, address, city, country, state, phone);
	}

}
