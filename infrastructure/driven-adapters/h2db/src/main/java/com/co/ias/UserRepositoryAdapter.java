package com.co.ias;

import java.util.List;

import com.co.ias.DBO.UserDBO;
import com.co.ias.gateway.UserRepositoryGateway;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryAdapter implements UserRepositoryGateway {

    private final IUserRepository userRepository;

    public UserRepositoryAdapter(IUserRepository userRepository) {this.userRepository = userRepository;}

    @Override
    public void save(User user) {

        userRepository.save(UserDBO.fromDomain(user));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll().stream().map(UserDBO::toDomain).toList();
    }
}