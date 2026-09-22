package com.moviebooking.movie_booking.Seat;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SeatService {

    private final SeatRepository seatRepository;

    public SeatService(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    public List<Seat> getSeatsByTheatreId(Integer theaterId) {
        return seatRepository.findByTheaterIdOrderbySeatRowAsSeatNumberAcs(theaterId);
    }
}
