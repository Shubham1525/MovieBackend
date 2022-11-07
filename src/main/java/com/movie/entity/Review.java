package com.movie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "review")
public class Review {

	@javax.persistence.Id
	@Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@Column(name = "username")
	public String username;
	
	@Column(name = "reviews")
	public String reviews;
	

}
