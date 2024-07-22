package launcher;

import controller.SQLController;
import view.MainMenuView;

public class Main {

	public static void main(String[] args) {
		
		// Database Connection
		SQLController sqlController = new SQLController();
		
		// Program initialize, show Start Menu
		new MainMenuView();
		

	}

}
