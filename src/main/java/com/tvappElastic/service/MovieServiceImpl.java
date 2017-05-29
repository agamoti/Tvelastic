package com.tvappElastic.service;

import com.tvappElastic.model.Movie;
import com.tvappElastic.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by agamoti on 29/05/17.
 */

@Service
public class MovieServiceImpl implements  MovieService {


    @Autowired
    private MovieRepository movieRepository;


    @Override
    public void save(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void delete(Movie movie) {
        movieRepository.delete(movie);
    }

    @Override
    public Movie findOne(String id) {
       return movieRepository.findOne(id);
    }

    @Override
    public Iterable<Movie> findAll() {
        return movieRepository.findAll();
    }

}
