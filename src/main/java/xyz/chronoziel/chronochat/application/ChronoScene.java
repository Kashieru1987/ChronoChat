package xyz.chronoziel.chronochat.application;

import javafx.scene.Parent;
import javafx.scene.Scene;

public class ChronoScene extends Scene {

	public ChronoScene(Parent root) {
		super(root);

		this.initChronoScene();
	}

	public void initChronoScene() {
		this.setFill(ApplicationConstants.SCENE_FILL);
	}

}
