package xyz.chronoziel.chronochat.user;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.github.cdimascio.dotenv.Dotenv;
import xyz.chronoziel.chronochat.GeneralConstants;

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

	public static User getTestUser() {

		final Dotenv dotenv = Dotenv.load();
		
		final String username = dotenv.get("USERNAME");
		final String password = dotenv.get("PASSWORD");
		final String host = dotenv.get("HOST");

		final User user = new User(username, password, host);

		return user;

	}



}
