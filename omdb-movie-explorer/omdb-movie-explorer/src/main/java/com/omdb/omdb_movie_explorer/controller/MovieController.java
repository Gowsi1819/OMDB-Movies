package com.omdb.omdb_movie_explorer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.omdb.omdb_movie_explorer.model.MovieDetailResponse;
import com.omdb.omdb_movie_explorer.model.MovieSearchResponse;
import com.omdb.omdb_movie_explorer.service.MovieService;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/api/movies/search")
    public MovieSearchResponse searchMovies(@RequestParam String title) {
        return movieService.searchMovies(title);
    }
    
    @GetMapping("/api/movies/details")
    public MovieDetailResponse getMovieDetails(@RequestParam String id) {
        return movieService.getMovieDetails(id);
    }

}
