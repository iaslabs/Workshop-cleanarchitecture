package com.co.ias.cleanarchitecture.domain.model.gateway;

import java.util.List;

import com.co.ias.cleanarchitecture.domain.model.User;

public interface UserGateway {

    String createUser(User user);
    List<User> getUsers();
}
