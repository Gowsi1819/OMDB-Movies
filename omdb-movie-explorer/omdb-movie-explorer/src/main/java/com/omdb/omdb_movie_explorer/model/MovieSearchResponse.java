package com.omdb.omdb_movie_explorer.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MovieSearchResponse {

    // map the JSON "Search" array into this field
    @JsonProperty("Search")
    private List<MovieSummary> search;

    // OMDB returns this as "totalResults" (string)
    @JsonProperty("totalResults")
    private String totalResults;

    // "Response" -> "True" or "False"
    @JsonProperty("Response")
    private String response;
}
