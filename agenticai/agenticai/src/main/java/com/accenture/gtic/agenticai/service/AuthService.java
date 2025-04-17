package com.accenture.gtic.agenticai.service;

import com.accenture.gtic.agenticai.entity.User;
import com.accenture.gtic.agenticai.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    public boolean authenticate(String username, String password) {
        return userRepository.findByUsername(username)
                .map(user -> user.getPassword().equals(password)) // replace with hash check later
                .orElse(false);
    }

    public String getUserType(String username) {
        return userRepository.findByUsername(username)
                .map(User::getUserType)
                .orElse("UNKNOWN");
    }
}
