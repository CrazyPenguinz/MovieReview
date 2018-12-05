package controller;

import databaseConnector.MoviesDBConnector;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Movie;

import java.io.IOException;
import java.util.ArrayList;

public class HomeController {
    private MovieController movieController;
    private String chooseCategory;
    private ArrayList<ImageView> topRate = new ArrayList<>();

    @FXML private ImageView topRate1, topRate2, topRate3;
    @FXML private Button sciFi, action, romance, drama;

    public void initialize() {
        topRate.clear();
        topRate.add(topRate1);
        topRate.add(topRate2);
        topRate.add(topRate3);
//        setUpTopRateImage(MoviesDBConnector.getTopRating());
//        set up ImageView can clickable
        topRate1 = new ImageView();
        topRate1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Stage stage = (Stage) topRate1.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/MoviePage.fxml"));
                try {
                    stage.setScene(new Scene(loader.load(), 404, 550));
                    movieController = loader.getController();
//                    movieController.setMovie(topRate1.get);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

//        set up Category menu
//        sciFi.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                chooseCategory = "sci-fi";
//            }
//        });
    }

    private void choosedCategory(){

    }

//    set up icon to ImageView
    private void setUpTopRateImage(ObservableList<Movie> topRateDB) {
        int i = 0;
        for (ImageView imageView : topRate) {
            imageView.setImage(new Image(topRateDB.get(i++).getPicture()));
        }
    }


}
