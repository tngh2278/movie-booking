package com.moviebooking.movie_booking.Seat;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theaters")
public class SeatController {

    private final SeatService seatService;

    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    @GetMapping("/{theaterId}/seats")
    public List<Seat> getStats(
            // PAthVariable 주소 규칙 -> /theaters/1/seats
            // RequestParam 주소 규칙 -> /screenings?movieId=1
            @PathVariable Integer theaterId) {
        return seatService.getSeatsByTheatreId(theaterId);
    }
}
