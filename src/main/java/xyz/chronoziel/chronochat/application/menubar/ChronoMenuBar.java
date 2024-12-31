package xyz.chronoziel.chronochat.application.menubar;

import java.util.List;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class ChronoMenuBar extends MenuBar {

	public ChronoMenuBar() {
		List<Menu> menuList = this.getMenus();

		menuList.add(MainMenu.getMenu());
	}

	public static class MainMenu {

		public static Menu getMenu() { 
			Menu mainMenu = new Menu("ChronoChat");
			List<MenuItem> menuItems = mainMenu.getItems();

			MenuItem startOrJoinChat = new MenuItem("Start/Join Chat");
			startOrJoinChat.setOnAction(actionevent -> {
				
			});

			menuItems.add(startOrJoinChat);

			return mainMenu;
		}
	}


}
