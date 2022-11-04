package com.movie.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.movie.entity.FavouriteMovies;



public interface FavouriteMovieRepository  extends JpaRepository<FavouriteMovies,Long> {

}
