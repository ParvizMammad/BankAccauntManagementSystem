package com.example.bankAccauntManagementSystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,nullable = false)
    private String accountNumber;
    @Column(nullable = false)
    private Double balance;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
