package xyz.chronoziel.chronochat.application;

import java.awt.Dimension;

import javafx.stage.Stage;
import xyz.chronoziel.chronochat.AppElements;

public class ChronoStage extends Stage {

	public ChronoStage() {
		this.initChronoStage();
	}

	public void initChronoStage() {
		final AppElements elementsInstance = AppElements.getInstance();

		this.setTitle(ApplicationConstants.TITLE);
		this.setSize(ApplicationConstants.SIZE);
		this.setScene(elementsInstance.getScene());
		this.setMaximized(true);
		this.show();
	}

	public void setSize(final Dimension size) {
		this.setWidth(size.getWidth());
		this.setHeight(size.getHeight());
	}

}
