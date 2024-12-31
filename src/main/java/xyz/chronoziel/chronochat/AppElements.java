package xyz.chronoziel.chronochat;

import java.util.List;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import xyz.chronoziel.chronochat.application.ChronoScene;
import xyz.chronoziel.chronochat.application.menubar.ChronoMenuBar;

public class AppElements {

	private static AppElements instance;

	private ChronoScene scene;
	private ChronoMenuBar menuBar;
	private VBox root;

	private AppElements() {
		root = new VBox();
		menuBar = new ChronoMenuBar();
		scene = new ChronoScene(root);

		this.addElementsToRoot();
	}

	private void addElementsToRoot() {
		List<Node> nodes = root.getChildren();

		nodes.add(menuBar);
	}

	public Parent getRoot() {
		return this.root;
	}

	public ChronoScene getScene() {
		return this.scene;
	}

	public ChronoMenuBar getMenuBar() {
		return this.menuBar;
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
