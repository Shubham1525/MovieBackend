package com.movie.implement;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.movie.entity.UserDao;
import com.movie.model.UserDto;
import com.movie.repos.UserRepository;
import com.movie.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    

    
    @Override
    public UserDto registerNewUser(UserDto userdto) {

        UserDao user = this.modelMapper.map(userdto, UserDao.class);

        // encoded the password
        user.setPassword(this.passwordEncoder.encode(user.getPassword()));

       
      

       

        UserDao newUser = this.userRepository.save(user);

        return this.modelMapper.map(newUser, UserDto.class);
    }

	


}
