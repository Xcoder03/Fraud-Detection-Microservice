package com.example.Fraud.Detection.Services;

import com.example.Fraud.Detection.Payload.requests.LoginRequest;
import com.example.Fraud.Detection.Payload.requests.SignupRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AuthService  extends UserDetailsService {

    ResponseEntity<?>  SignUpUserRequest(SignupRequest request);
    ResponseEntity<?>   SignInUserRequest(LoginRequest request);
}
