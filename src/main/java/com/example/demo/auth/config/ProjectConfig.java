package com.example.demo.auth.config;

import com.example.demo.auth.CustomUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class ProjectConfig {


    @Bean
    public UserDetailsService userDetailsService(){
        return new CustomUserDetailsService();
    }
}
