package com.co.ias.cleanarchitecture.domain.usecase;

import java.util.List;

import com.co.ias.cleanarchitecture.domain.model.User;
import com.co.ias.cleanarchitecture.domain.model.gateway.UserGateway;

public class UserUseCase {

    private final UserGateway userGateway;

    public UserUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public String createUser(User user){

        return userGateway.createUser(user);
    }

    public List<User> getUsers() {
        return userGateway.getUsers();
    }
}
