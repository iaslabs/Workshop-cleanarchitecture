package com.co.ias.config;

import com.co.ias.UserUseCase;
import com.co.ias.gateway.UserRepositoryGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfigurationBean {

    @Bean
    public UserUseCase userUseCase(UserRepositoryGateway userRepositoryGateway) {
        return new UserUseCase(userRepositoryGateway);
    }
}
