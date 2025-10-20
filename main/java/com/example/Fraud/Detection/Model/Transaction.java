package com.example.Fraud.Detection.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name= "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @DecimalMin("0.0")
    private BigDecimal amount;

    private LocalDateTime timestamp = LocalDateTime.now();

    @ManyToOne(optional = false)
    private User user;

    private int riskScore;      // computed risk score
    private boolean highRisk;   // flagged if riskScore exceeds threshold
}
