package com.example.bankAccauntManagementSystem.controller;

import com.example.bankAccauntManagementSystem.model.Transaction;
import com.example.bankAccauntManagementSystem.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction){
        return transactionService.createTransaction(transaction);
    }
    @GetMapping("/account/{accountId}")
    public List<Transaction> getTransactionByAccount(@PathVariable Long accountId){
        return transactionService.getTransactionByAccountId(accountId);
    }

    @GetMapping
    public List<Transaction> getAllTransactions(){
        return transactionService.getAllTransactions();
    }

}
