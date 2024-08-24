package com.example.bankAccauntManagementSystem.service;

import com.example.bankAccauntManagementSystem.model.Transaction;
import com.example.bankAccauntManagementSystem.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;


    public Transaction createTransaction(Transaction transaction){
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getTransactionByAccountId(Long accountId){
        return transactionRepository.findByFromAccountIdOrToAccountId(accountId,accountId);
    }

    public List<Transaction> getAllTransactions(){
        return transactionRepository.findAll();
    }
}
