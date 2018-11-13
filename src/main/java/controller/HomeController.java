package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {
    @FXML private MenuBar menuBar = new MenuBar();
    @FXML private Menu menu = new Menu();
    @FXML private MenuItem action, scifi, fantasy, drama, adventure, animation;

    public void initialize() {

    }

    public void sciFiOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) menuBar.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/SciFiPage.fxml"));
        stage.setScene(new Scene(loader.load(), 404, 550));
        stage.show();
    }

    public void actionOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) menuBar.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ActionPage.fxml"));
        stage.setScene(new Scene(loader.load(), 404, 550));
        stage.show();
    }

    public void fantasyOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) menuBar.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FantasyPage.fxml"));
        stage.setScene(new Scene(loader.load(), 404, 550));
        stage.show();
    }

    public void dramaOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) menuBar.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/DramaPage.fxml"));
        stage.setScene(new Scene(loader.load(), 404, 550));
        stage.show();
    }

    public void adventureOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) menuBar.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/AdventurePage.fxml"));
        stage.setScene(new Scene(loader.load(), 404, 550));
        stage.show();
    }

    public void animationOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) menuBar.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/AnimationPage.fxml"));
        stage.setScene(new Scene(loader.load(), 404, 550));
        stage.show();
    }
}
