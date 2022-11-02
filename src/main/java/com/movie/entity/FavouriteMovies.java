package com.movie.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "favouriteMovies")
public class FavouriteMovies {

	@javax.persistence.Id
	@Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long Id;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="movieId")
	public Movies movies;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="userId")
	public User user;
}
