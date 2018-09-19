package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;

public class HomeController {
    @FXML private MenuBar menuBar = new MenuBar();
    @FXML private Menu menu = new Menu();
    @FXML private MenuItem action = new MenuItem("Action");

    public void initialize() {
        menu.setGraphic(new ImageView("/MenuIcon.png"));
        menu.getItems().add(action);
        menuBar.getMenus().add(menu);
    }
}
