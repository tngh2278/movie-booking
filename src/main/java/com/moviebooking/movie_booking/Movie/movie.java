package com.moviebooking.movie_booking.Movie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class movie {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(name = "running_time", nullable = false)
    private Integer runningtime;

    @Column(name = "age_rating")
    private String ageRating;

    protected movie() {
    }

}
