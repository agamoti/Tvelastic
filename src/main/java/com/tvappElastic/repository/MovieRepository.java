package com.tvappElastic.repository;

import com.tvappElastic.model.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import java.util.ArrayList;


/**
 * Created by agamoti on 29/05/17.
 */
public interface MovieRepository extends ElasticsearchRepository<Movie, String> {
    Page<Movie> findByDirector(String author, Pageable pageable);
    Page<Movie> findByCategory(ArrayList<String> tags);
    Page<Movie> findRatedOverX(Integer Rating);
    Page<Movie> findRatedBelowX(Integer Rating);
    /*


    Could be a lot of filters...

     */
    Page<Movie> findByTitle(String title);



}


