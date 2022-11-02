package com.movie.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.entity.FavouriteMovies;


public interface FavouriteMovieRepository  extends JpaRepository<FavouriteMovies,Long> {

}
