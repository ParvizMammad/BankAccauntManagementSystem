package com.example.bankAccauntManagementSystem.repository;

import com.example.bankAccauntManagementSystem.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {
   List<Transaction> findByFromAccountIdOrToAccountId(Long fromAccountId, Long toAccountId);
}
