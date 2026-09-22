package com.moviebooking.movie_booking.Movie.Screening;

import java.util.List;

import org.springframework.stereotype.Service;

@Service // 실제 서비스 처리. 스프링이 관리하는 객체로 등록
public class ScreeningService {

    private final ScreeningRepository screeningRepository;

    public ScreeningService(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    public List<Screening> getScreeningsByMovieId(Long movieId) {
        return screeningRepository.findByMovieId(movieId);
    }
}
