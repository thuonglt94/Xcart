package detail;

public class LoginDetail {
	private String email;

	private String pass;

	public LoginDetail(String email, String pass) {
		this.email = email;
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public String getPass() {
		return pass;
	}
}
