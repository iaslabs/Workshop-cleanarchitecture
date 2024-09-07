package com.co.ias.cleanarchitecture.domain.usecase;

import java.util.List;

import com.co.ias.cleanarchitecture.domain.model.User;
import com.co.ias.cleanarchitecture.domain.model.gateway.UserGateway;
import com.co.ias.cleanarchitecture.infrastructure.driven_adapters.DBO.UserDBO;
import com.co.ias.cleanarchitecture.infrastructure.driven_adapters.IUserRepositoryAdapter;
import lombok.RequiredArgsConstructor;

public class UserUseCase {

    private final UserGateway userGateway;

    public UserUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public String createUser(User user){

        String userCreatedMessage = userGateway.createUser(user);
        return userCreatedMessage;
    }

    public List<User> getUsers() {
        return userGateway.getUsers();
    }
}
