package com.tvappElastic.service;

import com.tvappElastic.model.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * Created by agamoti on 29/05/17.
 */
public interface MovieService {
    void save(Movie movie);
    void delete(Movie movie);
    Movie findOne(String id);
    Iterable<Movie> findAll();
    /*

    TBD

     */
}

