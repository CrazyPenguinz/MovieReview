package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.Movie;

import javax.swing.text.html.ImageView;

public class MovieController {
    private Movie movie;

    @FXML private ImageView imageView;
    @FXML private Label title, description, review, rating;

    public void initialize() {

    }

    public void setMovie(Movie movie) {
        this.movie = movie;
        setUpPage();
    }

    private void setUpPage() {
        title.setText(movie.getName());
        description.setText(movie.getSynopsis());
        review.setText(movie.getReview());
        rating.setText(String.valueOf(movie.getRating()));
    }
}
