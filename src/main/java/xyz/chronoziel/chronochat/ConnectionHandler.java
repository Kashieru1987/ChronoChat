package xyz.chronoziel.chronochat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import xyz.chronoziel.chronochat.user.User;

public class ConnectionHandler {

	public ConnectionHandler() {
	}

	public User getTestUser() {

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
