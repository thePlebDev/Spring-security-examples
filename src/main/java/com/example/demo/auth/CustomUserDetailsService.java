package com.example.demo.auth;

import com.example.demo.models.Users;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users returnedUser = userRepository.findUserByUserName(username);
        if(returnedUser == null){
            throw new UsernameNotFoundException("USERNAME NOT FOUND");
        }
        UserDetails securityUser = new SecurityUser(returnedUser);
        return securityUser;
    }
}
