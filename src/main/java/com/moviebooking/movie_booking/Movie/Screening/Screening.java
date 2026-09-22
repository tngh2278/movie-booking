package com.moviebooking.movie_booking.Movie.Screening;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "screenings")
public class Screening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    @Column(name = "movie_id", nullable = false)
    private Long movieId;

    @Column(name = "theater_id", nullable = false)
    private Integer theaterId;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalDateTime endTime;

    @Column(name = "base_price", nullable = false)
    private Integer basePrice;

    public Integer getId() {
        return id;
    }

    public Long getMovieId() {
        return movieId;
    }

    public Integer getTheaterId() {
        return theaterId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public Integer getBasePrice() {
        return basePrice;
    }
}
