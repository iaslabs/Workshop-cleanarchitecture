package com.co.ias;

import java.util.List;

import com.co.ias.gateway.UserRepositoryGateway;

public class UserRepositoryAdapter implements UserRepositoryGateway {

    private final IUserRepository userRepository;

    public UserRepositoryAdapter(IUserRepository userRepository) {this.userRepository = userRepository;}

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}