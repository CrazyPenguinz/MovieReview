package model;

public class Movie {
    private String picture;
    private String genre;
    private String name;
    private String director;
    private String actor;
    private String movieStudio;
    private String review;
    private String synopsis;
    private int rating;
    private int movieRate;
    private int length;
    private String releaseDate;

    public Movie(String picture, String genre, String name, String director, String actor, String movieStudio, String review, String synopsis, int rating, int movieRate, int length, String releaseDate) {
        this.picture = picture;
        this.genre = genre;
        this.name = name;
        this.director = director;
        this.actor = actor;
        this.movieStudio = movieStudio;
        this.review = review;
        this.synopsis = synopsis;
        this.rating = rating;
        this.movieRate = movieRate;
        this.length = length;
        this.releaseDate = releaseDate;
    }
}
