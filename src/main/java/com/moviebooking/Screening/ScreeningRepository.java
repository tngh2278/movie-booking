package com.moviebooking.Screening;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreeningRepository extends JpaRepository<Screening, Interger> {
    List<Screening> findByMovieId(Long movieId);
    // select * from screening where movie_id = ? 와 비슷한 조회 생성

}
