package com.rohi.spring_security.service;

import com.rohi.spring_security.entity.User;
import com.rohi.spring_security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User persist(User user){
        return userRepository.save(user);
    }

    public User find(String name) {
        return userRepository.findByUsername(name);
    }
}
