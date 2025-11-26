package com.omdb.omdb_movie_explorer.service;

import com.omdb.omdb_movie_explorer.model.MovieDetailResponse;
import com.omdb.omdb_movie_explorer.model.MovieSearchResponse;

public interface MovieService {
    MovieSearchResponse searchMovies(String title);
    MovieDetailResponse getMovieDetails(String id);

}
