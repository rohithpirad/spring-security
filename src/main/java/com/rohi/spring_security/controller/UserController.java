package com.rohi.spring_security.controller;

import com.rohi.spring_security.entity.User;
import com.rohi.spring_security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/fetch/{name}")
    private ResponseEntity<Object> getUserInfo(@PathVariable String name) {
        User user = null;
        try {
            user = userService.find(name);
        } catch (Exception e) {
            return new ResponseEntity<>("Something went wrong " + e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }

    @PostMapping("/save")
    private ResponseEntity<String> createUser(@RequestBody User user) {
        User persistedUser = null;
        try {
            persistedUser = userService.persist(user);
        } catch (Exception e) {
            return new ResponseEntity<>("Something went wrong " + e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("User Created Successfully with UserId: " + persistedUser.getUserId(), HttpStatus.ACCEPTED);
    }
}
