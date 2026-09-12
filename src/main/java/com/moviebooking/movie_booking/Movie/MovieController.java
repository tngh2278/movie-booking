package com.moviebooking.movie_booking.Movie;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController // 응답을 JSON으로 변환
@RequestMapping("/movies") // 기본 url /movies로 매핑
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping // 메소드가 get /movies 요청 처리
    public List<Movie> getMovies() {
        return movieService.getMovies();
    }

}
