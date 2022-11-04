package com.movie.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.movie.dtos.TrendingMoviesDto;
import com.movie.entity.Movies;
import com.movie.repos.MoviesRepository;




@Service
public class MovieService {

	private MoviesRepository _moviesRepo;
	
		public MovieService(MoviesRepository movieRepo) {
			
			_moviesRepo= movieRepo;
		}
        
		
		 @Autowired
		 private ModelMapper modelMapper;
		 
		public List<TrendingMoviesDto> GetAllTrendingMovies(){
			List<Movies> mov = _moviesRepo.findAllTrendingMovie();
			List<TrendingMoviesDto> movie = mov.stream().map((movies)-> this.modelMapper.map(movies, TrendingMoviesDto.class)).collect(Collectors.toList());
			return movie;	
		}
		 
		public List<Movies> findMovieWithSorting(String field){
			
			return _moviesRepo.findAll(Sort.by(Sort.Direction.ASC, field));
		}
		
      public List<Movies> findMovieWithSort(String field){
			
			return _moviesRepo.findAll(Sort.by(Sort.Direction.DESC, field));
		}
		
      public TrendingMoviesDto detailsOfMovies(long id) {
    	  Optional<Movies> movies = _moviesRepo.findById(id);
    	  return modelMapper.map(movies, TrendingMoviesDto.class);
      }
//      public List<FavouriteMovieResponseDto> getFavlist(){
//    	  
//      }
//      
      
		
       
		 
		
		 
}
