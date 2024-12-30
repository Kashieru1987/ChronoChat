package xyz.chronoziel.chronochat;

import xyz.chronoziel.chronochat.stage.ChronoApp;

public class Main {

	public Main() throws Exception {

		ChronoApp.launchApp();

	}

	public static void main(String[] args) {
		try {
			new Main();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
