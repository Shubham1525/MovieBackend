package com.movie.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "movies")
public class Movies {

	@javax.persistence.Id
	@Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@Column(name = "name")
	public String name;
	
	@Column(name = "genre")
	public String genre;
	
	@Column(name = "image")
	public String image;
	
	@Column(name = "rating")
	public String rating;
	
	@Column(name = "yoe")
	public int yoe;
	
	@Column(name = "language")
	public String language;
	
	@Column(name = "trending")
	public boolean trending;
	
	@OneToMany(mappedBy = "movies",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    public Set<FavouriteMovies> favouriteMovies=new HashSet<>();
}
