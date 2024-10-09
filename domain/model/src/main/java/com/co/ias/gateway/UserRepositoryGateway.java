package com.co.ias.gateway;

import java.util.List;

import com.co.ias.User;

public interface UserRepositoryGateway {
    void save(User user);
    List<User> findAll();
}
