package com.co.ias;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class ApiRest {

    private final UserUseCase userUseCase;

    public ApiRest(UserUseCase userUseCase) {this.userUseCase = userUseCase;}

    @PostMapping
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        userUseCase.registerUser(user);
        return new ResponseEntity<>("User registered", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<>(userUseCase.getUsers(), HttpStatus.OK);
    }
}
