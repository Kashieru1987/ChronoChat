package xyz.chronoziel.chronochat.application.menubar;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuItem;

public class ChronoMenuItem extends MenuItem {

	public ChronoMenuItem(String text, EventHandler<ActionEvent> event) {
		this.setText(text);
		
		if(event != null) {
			this.setOnAction(event);
		}

	}

}
