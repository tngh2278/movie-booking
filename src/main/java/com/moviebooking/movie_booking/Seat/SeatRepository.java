package com.moviebooking.movie_booking.Seat;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Integer> {

    List<Seat> findByTheaterIdOrderbySeatRowAsSeatNumberAcs(
            Integer theaterId);
    // 특정 상영관의 좌석을 행과 번호 순으로 조회
}
