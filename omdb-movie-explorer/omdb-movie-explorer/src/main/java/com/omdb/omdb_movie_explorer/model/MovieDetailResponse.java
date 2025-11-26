package com.omdb.omdb_movie_explorer.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieDetailResponse {

    @JsonAlias("Title")
    private String title;

    @JsonAlias("Year")
    private String year;

    @JsonAlias("Rated")
    private String rated;

    @JsonAlias("Released")
    private String released;

    @JsonAlias("Runtime")
    private String runtime;

    @JsonAlias("Genre")
    private String genre;

    @JsonAlias("Director")
    private String director;

    @JsonAlias("Writer")
    private String writer;

    @JsonAlias("Actors")
    private String actors;

    @JsonAlias("Plot")
    private String plot;

    @JsonAlias("Language")
    private String language;

    @JsonAlias("Country")
    private String country;

    @JsonAlias("Awards")
    private String awards;

    @JsonAlias("Poster")
    private String poster;

    @JsonAlias("imdbRating")
    private String imdbRating;

    @JsonAlias("BoxOffice")
    private String boxOffice;

    // ----------- Getters (lowercase output keys) -----------
    public String getTitle() { return title; }
    public String getYear() { return year; }
    public String getRated() { return rated; }
    public String getReleased() { return released; }
    public String getRuntime() { return runtime; }
    public String getGenre() { return genre; }
    public String getDirector() { return director; }
    public String getWriter() { return writer; }
    public String getActors() { return actors; }
    public String getPlot() { return plot; }
    public String getLanguage() { return language; }
    public String getCountry() { return country; }
    public String getAwards() { return awards; }
    public String getPoster() { return poster; }
    public String getImdbRating() { return imdbRating; }
    public String getBoxOffice() { return boxOffice; }

    // ----------- Setters -----------
    public void setTitle(String title) { this.title = title; }
    public void setYear(String year) { this.year = year; }
    public void setRated(String rated) { this.rated = rated; }
    public void setReleased(String released) { this.released = released; }
    public void setRuntime(String runtime) { this.runtime = runtime; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setDirector(String director) { this.director = director; }
    public void setWriter(String writer) { this.writer = writer; }
    public void setActors(String actors) { this.actors = actors; }
    public void setPlot(String plot) { this.plot = plot; }
    public void setLanguage(String language) { this.language = language; }
    public void setCountry(String country) { this.country = country; }
    public void setAwards(String awards) { this.awards = awards; }
    public void setPoster(String poster) { this.poster = poster; }
    public void setImdbRating(String imdbRating) { this.imdbRating = imdbRating; }
    public void setBoxOffice(String boxOffice) { this.boxOffice = boxOffice; }

    @Override
    public String toString() {
        return "MODEL_LOADED_SUCCESSFULLY";
    }
}
