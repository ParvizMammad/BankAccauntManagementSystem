package com.example.bankAccauntManagementSystem.service;

import com.example.bankAccauntManagementSystem.model.Account;
import com.example.bankAccauntManagementSystem.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account){
        return accountRepository.save(account);
    }

    public Optional<Account> getAccountById(Long accountId){
        return accountRepository.findById(accountId);
    }

    public Optional<Account> getAccountByNumber(String accountNumber){
        return accountRepository.findByAccountNumber(accountNumber);
    }

    public Account updateAccount(Account account){
        return accountRepository.save(account);
    }

    public void deleteAccount(Long accountId){
        accountRepository.deleteById(accountId);
    }

}
