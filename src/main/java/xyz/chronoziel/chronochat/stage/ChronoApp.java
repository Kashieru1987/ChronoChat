package xyz.chronoziel.chronochat.stage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChronoApp extends Application {

	public ChronoApp() {
	}

	@Override
	public void start(Stage stage) throws Exception {

		this.initStage(stage);

	}

	public void initStage(Stage stage) {
		Group root = new Group();
		Scene scene = this.createScene(root);

		stage.setTitle(StageConstants.TITLE);
		stage.setScene(scene);
		stage.setMaximized(true);
		stage.show();
	}

	public Scene createScene(Group root) {
		Scene outputScene = new Scene(root);

		outputScene.setFill(StageConstants.SCENE_FILL);

		return outputScene;
	}

	/**
	 * For some reason it has a fit if you directly call launch from a non-application subclass.<br>
	 * A helper method needs to call it to avoid an error.
	 */
	public static void launchApp() {
		ChronoApp.launch();
	}

}
