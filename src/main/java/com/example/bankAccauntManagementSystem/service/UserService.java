package com.example.bankAccauntManagementSystem.service;

import com.example.bankAccauntManagementSystem.model.User;
import com.example.bankAccauntManagementSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user){
        return userRepository.save(user);
    }
    public Optional<User> getUSerById(Long userId){
        return userRepository.findById(userId);
    }
    public Optional<User> getUserByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long userId){
        userRepository.deleteById(userId);
    }

}
