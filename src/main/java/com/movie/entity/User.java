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
@Table(name = "user")
public class User {


	@javax.persistence.Id
	@Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@Column(name = "username")
	public String name;
	
	@Column(name = "email")
	public String email;
	
	@Column(name = "password")
	public String password;
	
	@Column(name = "image")
	public String image;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    public Set<FavouriteMovies> favouriteMovies=new HashSet<>();
	
}
