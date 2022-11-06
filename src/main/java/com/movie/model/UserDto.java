package com.movie.model;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.movie.entity.FavouriteMovies;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private long id;
	
	@NotEmpty
    @Size(min = 5,message = "UserName must be of minimum length of 5")
    private String username;
	
	@NotEmpty
    @Size(min = 3,max = 10,message = "Password length should be min 3 and max 10 in length")
    private String password;
	
	@Email(message = "Email address is not valid")
    private String email;
	private Set<FavouriteMovies> favouriteMovies=new HashSet<>();
    
   
}
