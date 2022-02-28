package com.example.demo.auth;

import com.example.demo.models.Users;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      Users user =  userRepository.getUserByUsername(username);
      if(user == null){
          throw new UsernameNotFoundException("USERNAME NOT FOUND");
      }
        UserDetails securityUser = new SecurityUser(user);

      return securityUser;
    }
}
