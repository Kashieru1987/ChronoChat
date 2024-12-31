package xyz.chronoziel.chronochat;

import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import xyz.chronoziel.chronochat.application.ChronoScene;

public class AppElements {

	private volatile static AppElements instance;

	private VBox root;
	private ChronoScene scene;

	private AppElements() {
		root = new VBox();
		scene = new ChronoScene(root);
	}

	public Parent getRoot() {
		return this.root;
	}

	public ChronoScene getScene() {
		return this.scene;
	}

	public static AppElements getInstance() {
		AppElements appElementsInstance = instance;

		if(appElementsInstance == null) {
			synchronized(AppElements.class) {
				appElementsInstance = instance;
				if(appElementsInstance == null) {
					instance = appElementsInstance = new AppElements();
				}
			}
		}

		return appElementsInstance;
	}

}
