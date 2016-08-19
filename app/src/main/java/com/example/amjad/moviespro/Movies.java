package com.example.amjad.moviespro;
import android.graphics.Movie;

import org.json.JSONArray;

public class Movies {

    private String title;
    private String id;
    private String vote_average;
    private String m_image;
    private String release_date;
    private String overview;
    private String revenue;
    private String[] genres;

    public Movies() {
        // TODO Auto-generated constructor stub
    }

    public Movies(String title,String[] genres, String overview, String m_image, String vote_average, String id, String revenue, String release_date) {
        this.title = title;
        this.genres = genres;
        this.overview = overview;
        this.m_image = m_image;
        this.vote_average = vote_average;
        this.id = id;
        this.revenue = revenue;
        this.release_date = release_date;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getRevenue() {
        return revenue;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getM_image() {
        return "http://image.tmdb.org/t/p/w342"+ m_image;
    }

    public String get_M_image() {
        return "http://image.tmdb.org/t/p/w780"+ m_image;
    }


    public void setM_image(String m_image) {
        this.m_image = m_image;
    }

    public String getVote_average() {
        return vote_average;
    }

    public void setVote_average(String vote_average) {
        this.vote_average = vote_average;
    }
}
