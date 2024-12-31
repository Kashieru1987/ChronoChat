package xyz.chronoziel.chronochat.application;

import java.awt.Dimension;

import javafx.stage.Stage;
import xyz.chronoziel.chronochat.AppElements;

public class ChronoStage extends Stage {

	public ChronoStage() {
		this.initChronoStage();

		final AppElements elementsInstance = AppElements.getInstance();
		this.setScene(elementsInstance.getScene());

		this.show();
	}

	private void initChronoStage() {
		this.setTitle(ApplicationConstants.TITLE);
		this.setSize(ApplicationConstants.SIZE);
		this.setMaximized(true);
	}


	public void setSize(final Dimension size) {
		this.setWidth(size.getWidth());
		this.setHeight(size.getHeight());
	}

}
