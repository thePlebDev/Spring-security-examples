package com.example.demo.repository;

import com.example.demo.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Users, Long> {

    @Query(value = "SELECT * FROM Users WHERE Users.username = ?1" ,nativeQuery = true)
     public Users getUserByUsername(String username);
}
