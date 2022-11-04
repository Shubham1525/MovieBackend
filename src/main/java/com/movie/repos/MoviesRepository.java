package com.movie.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.movie.entity.Movies;

public interface MoviesRepository  extends JpaRepository<Movies,Long> {



    //JPQL
    @Query("SELECT p FROM Movies p WHERE p.trending = true")
    List<Movies> findAllTrendingMovie();
   

}
