package com.co.ias.cleanarchitecture.controller;

import java.util.List;

import com.co.ias.cleanarchitecture.model.User;
import com.co.ias.cleanarchitecture.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user){
        userService.createUser(user);
        return new ResponseEntity<>("User created", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getusers(){
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }
}
