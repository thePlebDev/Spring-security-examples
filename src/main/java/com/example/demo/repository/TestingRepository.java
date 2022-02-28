package com.example.demo.repository;

import com.example.demo.models.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public class TestingRepository {

    @Query(value = "SELECT * FROM Users where Users.username = ?1", nativeQuery = true)
    public Users findUserByUserName(String username) {
        return null;
    }
}
