package com.example.Fraud.Detection.repository;

import com.example.Fraud.Detection.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query(nativeQuery = true, value = "select count(id)>0 as record_exists from user where lower(email) = ? limit 1 ")
    Optional<User> findByEmail(String email);

    @Query(nativeQuery = true, value = "select * from user where lower(email) = ? order by id desc limit 1")
    boolean findUserByEmail(String email);
}
