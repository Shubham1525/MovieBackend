package com.movie.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrendingMoviesDto {

	public long id;
	public String name;
	public String genre;
	public String image;
	public int rating;
	public boolean trending;
	public int yoe;
	
}
