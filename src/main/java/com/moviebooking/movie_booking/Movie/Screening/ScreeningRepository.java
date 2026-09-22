package com.moviebooking.movie_booking.Movie.Screening;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreeningRepository
        extends JpaRepository<Screening, Integer> {
    // screenings 테이블 사용, 기본 키 타입 : Integer
    List<Screening> findByMovieId(Long movieId);
    // select * from screening where movie_id = ? 와 비슷한 조회 생성

}
