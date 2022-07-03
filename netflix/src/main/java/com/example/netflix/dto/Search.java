package com.example.netflix.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.vavr.collection.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Search {

    @JsonProperty("movies")
    List<Movie> movies;
}
