package detail;

public class CheckoutDetail {
	private String firstName;

	private String lastName;

	private String address;

	private String city;

	private String country;

	private String state;

	private String phone;

	public CheckoutDetail(String firstName, String lastName, String address, String city, String country, String state,
			String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.country = country;
		this.state = state;
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getState() {
		return state;
	}

	public String getPhone() {
		return phone;
	}

}
