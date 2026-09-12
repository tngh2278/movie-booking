package com.moviebooking.movie_booking.Movie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // 클래스를 DB테이블과 연결된 객체로 인식
@Table(name = "movies") // 연결할 테이블 : movies
public class Movie {

    @Id // 키본 키 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // mysql의 auto_increment 순서 지정방식 사용
    private Long id;

    @Column(nullable = false)
    // 속성명, 세부 속성 명시.(직관적인 가독성). 생략 가능
    private String title;

    @Column(name = "running_time", nullable = false)
    private Integer runningTime;

    @Column(name = "age_rating")
    private String ageRating;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}
