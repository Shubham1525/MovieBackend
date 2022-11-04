package com.movie.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.movie.constants.MovieConstants;
import com.movie.dtos.TrendingMoviesDto;
import com.movie.entity.Movies;
import com.movie.repos.MoviesRepository;
import com.movie.service.MovieService;

@CrossOrigin("*")
@RestController
public class MoviesController {

	@Autowired 
	private MoviesRepository moviesRepository;
	
	@Autowired
	   private MovieService movieService;
	
	   @GetMapping("/GetAllTrendingMovies")
	   public List<TrendingMoviesDto> GetAllTrendingMovies()
	    {
	        return movieService.GetAllTrendingMovies();
	    }
	  
	   @GetMapping("{field}")
	  public List<Movies> getMovieswithsort(@PathVariable String field){
		  List<Movies> allMovies = movieService.findMovieWithSorting(field);
		  return allMovies;
	   }
	   @RequestMapping(value=MovieConstants.GET_MOVIE_DATA,method=RequestMethod.GET)
		public List<Movies> getMoviesData(@PathVariable String field ) {
		   List<Movies> allMovies = movieService.findMovieWithSort(field);
			  return allMovies;
			
		}
	   
	    @GetMapping("/details/{id}")
		public TrendingMoviesDto detailsOfMovies(@PathVariable long id){
	    	return movieService.detailsOfMovies(id);
	    }
	   
	   
}
