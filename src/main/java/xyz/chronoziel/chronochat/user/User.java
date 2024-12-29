package xyz.chronoziel.chronochat.user;

public class User {

	private final String username;
	private final String password;
	private final String host;

	public User(final String username, final String password, final String host) {
		this.username = username;
		this.password = password;
		this.host = host;
	}

	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}

	public String getHost() {
		return this.host;
	}

}
