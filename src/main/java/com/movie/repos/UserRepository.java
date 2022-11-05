package com.movie.repos;


import org.springframework.data.repository.CrudRepository;


import com.movie.entity.UserDao;



public interface UserRepository  extends CrudRepository<UserDao,Integer>{
	UserDao findByUsername(String username);
}
