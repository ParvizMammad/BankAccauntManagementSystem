package com.example.bankAccauntManagementSystem.controller;

import com.example.bankAccauntManagementSystem.model.Account;
import com.example.bankAccauntManagementSystem.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public Account createAccount(@RequestBody Account account){
        return accountService.createAccount(account);
    }
    @GetMapping("/{id}")
    public Optional<Account> getAccountById(@PathVariable Long id){
        return accountService.getAccountById(id);
    }
    @GetMapping("/number/{accountNumber}")
    public Optional<Account> getAccountByNumber(@PathVariable String accountNumber){
        return accountService.getAccountByNumber(accountNumber);
    }

    @PutMapping("/{id}")
    public Account updateAccount(@PathVariable Long id,@RequestBody Account account){
        account.setId(id);
        return accountService.updateAccount(account);
    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable Long id){
        accountService.deleteAccount(id);
    }


}
