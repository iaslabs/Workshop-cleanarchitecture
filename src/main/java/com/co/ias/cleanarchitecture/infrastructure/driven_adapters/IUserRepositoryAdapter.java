package com.co.ias.cleanarchitecture.infrastructure.driven_adapters;

import java.util.ArrayList;
import java.util.List;

import com.co.ias.cleanarchitecture.domain.model.User;
import com.co.ias.cleanarchitecture.domain.model.gateway.UserGateway;
import com.co.ias.cleanarchitecture.infrastructure.driven_adapters.DBO.UserDBO;
import org.springframework.stereotype.Repository;

@Repository
public class IUserRepositoryAdapter implements UserGateway {

    private final IUserDBORepository userDBORepository;

    public IUserRepositoryAdapter(IUserDBORepository userDBORepository) {this.userDBORepository = userDBORepository;}

    @Override
    public String createUser(User user) {
        userDBORepository.save(UserDBO.fromDomain(user));
        return "Usuario registrado";
    }

    @Override
    public List<User> getUsers() {
        return userDBORepository.findAll().stream().map(UserDBO::toDomain).toList();
    }
}
