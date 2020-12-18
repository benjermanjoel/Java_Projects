package model;

import java.io.Serializable;

public class Movie implements Serializable {
    private String title;
    private String director;
    private int lengthInMinutes;
    private String imdbLink;
    private String imgSRC;

    // Constructors

    public Movie() {
    }

    public Movie(String title, String director, int lengthInMinutes, String imdbLink) {
        this.title = title;
        this.director = director;
        this.lengthInMinutes = lengthInMinutes;
        this.imdbLink = imdbLink;
    }

    //Getters and Setters


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public String getImdbLink() {
        return imdbLink;
    }

    public void setImdbLink(String imdbLink) {
        this.imdbLink = imdbLink;
    }

    //To-String


    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", lengthInMinutes=" + lengthInMinutes +
                ", imdbLink='" + imdbLink + "'}";
    }
}
