package com.example.Fraud.Detection.repository;

import com.example.Fraud.Detection.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
