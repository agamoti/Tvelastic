package com.tvappElastic.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.ArrayList;

/**
 * Created by agamoti on 29/05/17.
 */


@Document(indexName = "library", type = "Movies")
public class Movie {



    @Id
    private Long id;

    private String name;
    private String director;
    private Integer year;
    private Double votes;
    private Double rating;
    private ArrayList<String> tags;
    private ArrayList<String> actors;

    @Override
    public String toString() {
        return "Movie{" +
                "Name='" + name + '\'' +
                ", Director='" + director + '\'' +
                ", Year=" + year +
                ", Votes=" + votes +
                ", Rating=" + rating +
                ", Tags=" + tags +
                ", Actors=" + actors +
                '}';
    }

    public Movie(String name, String director, Integer year, Double votes, Double rating, ArrayList<String> tags, ArrayList<String> actors) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.votes = votes;
        this.rating = rating;
        this.tags = tags;
        this.actors = actors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriector() {
        return director;
    }

    public void setDriector(String director) {
        this.director = director;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getVotes() {
        return votes;
    }

    public void setVotes(Double votes) {
        this.votes = votes;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public void setActors(ArrayList<String> actors) {
        this.actors = actors;
    }
    public Long getId() {
        return id;
    }
}
