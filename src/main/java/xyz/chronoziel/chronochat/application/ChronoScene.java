package xyz.chronoziel.chronochat.application;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class ChronoScene extends Scene {

	public ChronoScene(Pane root) {
		super(root);
		this.initChronoScene();
	}

	private void initChronoScene() {
		this.setFill(ApplicationConstants.SCENE_FILL);
	}

}
