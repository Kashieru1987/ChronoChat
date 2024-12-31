package xyz.chronoziel.chronochat.application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class ChronoApp extends Application {

	public ChronoApp() {
	}

	@Override 
	public void init() {
		Platform.setImplicitExit(false); //allows me to not use the provided stage
	}

	@Override
	public void start(Stage unused) throws Exception {
		ChronoStage stage = new ChronoStage();
	}

	/**
	 * For some reason it has a fit if you directly call launch from a non-application subclass.<br>
	 * A helper method needs to call it to avoid an error.
	 */
	public static void launchApp() {
		ChronoApp.launch();
	}

}
