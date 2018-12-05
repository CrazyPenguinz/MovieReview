package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;

public class AddNewMoviePageController {
    @FXML private Button loadPictureBtn;
    @FXML private ImageView picture;

    @FXML
    public void loadPicture(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose your picture");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Choose only \".png\" file", "*.png"));
        File file = fileChooser.showOpenDialog(picture.getScene().getWindow());

        System.out.println(file.getName());
        picture.setImage(new Image("/icon/" + file.getName()));
    }
}
