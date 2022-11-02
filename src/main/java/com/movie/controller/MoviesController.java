package com.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.movie.dtos.TrendingMoviesDto;
import com.movie.service.MovieService;



@RestController
public class MoviesController {

	@Autowired
	   private MovieService movieService;
	

	   @GetMapping("/GetAllTrendingMovies")
	   public List<TrendingMoviesDto> GetAllTrendingMovies()
	    {
	        return movieService.GetAllTrendingMovies();
	    }
}
