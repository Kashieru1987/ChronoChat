package xyz.chronoziel.chronochat.user;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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

		final String directory = GeneralConstants.ACCOUNT_INFO_DIRECTORY;
		final String filename = GeneralConstants.ACCOUNT_INFO_FILENAME;

		final File file = new File(directory + filename);

		try(Scanner scanner = new Scanner(file)) {

			final String username = scanner.nextLine();
			final String password = scanner.nextLine();
			final String host = scanner.nextLine();

			final User user = new User(username, password, host);

			return user;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}



}
