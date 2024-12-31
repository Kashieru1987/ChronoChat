package xyz.chronoziel.chronochat.application.util;

import javafx.scene.Node;

public class ElementUtil {

	private ElementUtil() {
	}

	public static void setNodeColor(Node node, String color) {
		node.setStyle("-fx-background-color: " + color);
	}

}
