package com.co.ias;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ApiRest {

    private final UserUseCase userUseCase;

    public ApiRest(UserUseCase userUseCase) {this.userUseCase = userUseCase;}

    @PostMapping("/register")
    public void registerUser(User user) {
        userUseCase.registerUser(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return userUseCase.getUsers();
    }
}
