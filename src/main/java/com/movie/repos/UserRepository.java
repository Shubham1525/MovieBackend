package com.movie.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.entity.User;


public interface UserRepository  extends JpaRepository<User,Long> {

}
