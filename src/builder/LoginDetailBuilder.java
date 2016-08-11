package builder;

import detail.LoginDetail;

public class LoginDetailBuilder {
	private String email;

	private String pass;

	public LoginDetailBuilder withEmail(String email) {
		this.email = email;
		return this;
	}

	public LoginDetailBuilder withPass(String pass) {
		this.pass = pass;
		return this;
	}

	public LoginDetail build() {
		return new LoginDetail(email, pass);
	}
}
