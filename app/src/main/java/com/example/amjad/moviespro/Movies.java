package com.example.amjad.moviespro;
import android.graphics.Movie;
public class Movies {

    private String title;
    private String id;
    private String vote_average;
    private String m_image;

    public Movies() {
        // TODO Auto-generated constructor stub
    }

    public Movies(String id, String title, String m_image, String vote_average) {
        this.id = id;
        this.title = title;
        this.m_image = m_image;
        this.vote_average = vote_average;
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
