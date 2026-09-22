package com.moviebooking.movie_booking.Seat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "seats")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "theater_id", nullable = false)
    private Integer theaterId;

    @Column(name = "seat_row", nullable = false)
    private String seatRow;

    @Column(name = "seat_number", nullable = false)
    private Integer seatNumber;

    @Column(name = "seat_type", nullable = false)
    private String seatType;

    public Integer getId() {
        return id;
    }

    public Integer getTheaterId() {
        return theaterId;
    }

    public String getSeatRow() {
        return seatRow;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public String getseatType() {
        return seatType;
    }
}
