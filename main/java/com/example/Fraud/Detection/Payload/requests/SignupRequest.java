package com.example.Fraud.Detection.Payload.requests;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SignupRequest {

    @JsonProperty("full_name")
    private String fullname;

    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;
}
