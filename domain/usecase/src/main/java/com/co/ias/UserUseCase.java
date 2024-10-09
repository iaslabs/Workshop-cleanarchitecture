package com.co.ias;

import java.util.List;

import com.co.ias.gateway.UserRepositoryGateway;

public class UserUseCase {

    private final UserRepositoryGateway userRepositoryGateway;

    public UserUseCase(UserRepositoryGateway userRepositoryGateway) {this.userRepositoryGateway = userRepositoryGateway;}

    public void registerUser(User user) {
        userRepositoryGateway.save(user);
    }

    public List<User> getUsers() {
        return userRepositoryGateway.findAll();
    }
}
