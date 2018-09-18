package databaseConnector;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Movie;

import java.sql.*;

public class MoviesDBConnector {
    private static String myDriver = "org.sqlite.JDBC";
    private static String urlDB = "jdbc:sqlite:Database.db";

    public static ObservableList<Movie> getMovies() {
        ObservableList<Movie> movies = FXCollections.observableArrayList();
        try {
            Class.forName(myDriver);
            Connection connection = DriverManager.getConnection(urlDB);
            if (connection != null) {
                String query = "select * from Movies";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    String picture = resultSet.getString("Picture");
                    String genre = resultSet.getString("Genre");
                    String name = resultSet.getString("Name");
                    String director = resultSet.getString("Director");
                    if (director == null) director = "";
                    String actor = resultSet.getString("Actors");
                    if (actor == null) actor = "";
                    String movieStudio = resultSet.getString("MovieStudio");
                    if (movieStudio == null) movieStudio = "";
                    String review = resultSet.getString("Review");
                    String synopsis = resultSet.getString("Synopsis");
                    int rating = resultSet.getInt("Rating");
                    int movieRate = resultSet.getInt("MovieRate");
                    int length = resultSet.getInt("Length");
                    String releaseDate = resultSet.getString("ReleaseDate");
                    movies.add(new Movie(picture, genre, name, director, actor, movieStudio,
                            review, synopsis, rating, movieRate, length, releaseDate));
                }
                connection.close();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movies;
    }

    public static ObservableList<Movie> getMoviesByGenre(String gen) {
        ObservableList<Movie> movies = FXCollections.observableArrayList();
        try {
            Class.forName(myDriver);
            Connection connection = DriverManager.getConnection(urlDB);
            if (connection != null) {
                String query = "select * from Movies where Genre = '" + gen + "'";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    String picture = resultSet.getString("Picture");
                    String genre = resultSet.getString("Genre");
                    String name = resultSet.getString("Name");
                    String director = resultSet.getString("Director");
                    if (director == null) director = "";
                    String actor = resultSet.getString("Actors");
                    if (actor == null) actor = "";
                    String movieStudio = resultSet.getString("MovieStudio");
                    if (movieStudio == null) movieStudio = "";
                    String review = resultSet.getString("Review");
                    String synopsis = resultSet.getString("Synopsis");
                    int rating = resultSet.getInt("Rating");
                    int movieRate = resultSet.getInt("MovieRate");
                    int length = resultSet.getInt("Length");
                    String releaseDate = resultSet.getString("ReleaseDate");
                    movies.add(new Movie(picture, genre, name, director, actor, movieStudio,
                            review, synopsis, rating, movieRate, length, releaseDate));
                }
                connection.close();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movies;
    }

    public static ObservableList<Movie> getTopRating() {
        ObservableList<Movie> movies = FXCollections.observableArrayList();
        try {
            Class.forName(myDriver);
            Connection connection = DriverManager.getConnection(urlDB);
            if (connection != null) {
                String query = "select * from Movies order by Rating DESC";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    String picture = resultSet.getString("Picture");
                    String genre = resultSet.getString("Genre");
                    String name = resultSet.getString("Name");
                    String director = resultSet.getString("Director");
                    if (director == null) director = "";
                    String actor = resultSet.getString("Actors");
                    if (actor == null) actor = "";
                    String movieStudio = resultSet.getString("MovieStudio");
                    if (movieStudio == null) movieStudio = "";
                    String review = resultSet.getString("Review");
                    String synopsis = resultSet.getString("Synopsis");
                    int rating = resultSet.getInt("Rating");
                    int movieRate = resultSet.getInt("MovieRate");
                    int length = resultSet.getInt("Length");
                    String releaseDate = resultSet.getString("ReleaseDate");
                    movies.add(new Movie(picture, genre, name, director, actor, movieStudio,
                            review, synopsis, rating, movieRate, length, releaseDate));
                }
                connection.close();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movies;
    }

    public static ObservableList<Movie> getNewMovies() {
        ObservableList<Movie> movies = FXCollections.observableArrayList();
        try {
            Class.forName(myDriver);
            Connection connection = DriverManager.getConnection(urlDB);
            if (connection != null) {
                String query = "select * from Movies order by ReleaseDate DESC";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    String picture = resultSet.getString("Picture");
                    String genre = resultSet.getString("Genre");
                    String name = resultSet.getString("Name");
                    String director = resultSet.getString("Director");
                    if (director == null) director = "";
                    String actor = resultSet.getString("Actors");
                    if (actor == null) actor = "";
                    String movieStudio = resultSet.getString("MovieStudio");
                    if (movieStudio == null) movieStudio = "";
                    String review = resultSet.getString("Review");
                    String synopsis = resultSet.getString("Synopsis");
                    int rating = resultSet.getInt("Rating");
                    int movieRate = resultSet.getInt("MovieRate");
                    int length = resultSet.getInt("Length");
                    String releaseDate = resultSet.getString("ReleaseDate");
                    movies.add(new Movie(picture, genre, name, director, actor, movieStudio,
                            review, synopsis, rating, movieRate, length, releaseDate));
                }
                connection.close();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movies;
    }

}
