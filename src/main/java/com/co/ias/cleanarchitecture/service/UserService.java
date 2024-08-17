package com.co.ias.cleanarchitecture.service;

import java.util.List;

import com.co.ias.cleanarchitecture.model.User;
import com.co.ias.cleanarchitecture.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final IUserRepository userRepository;

    public void createUser(User user){
        userRepository.save(user);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
