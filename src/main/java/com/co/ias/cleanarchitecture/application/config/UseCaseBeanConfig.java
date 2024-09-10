package com.co.ias.cleanarchitecture.application.config;

import com.co.ias.cleanarchitecture.domain.model.gateway.UserGateway;
import com.co.ias.cleanarchitecture.domain.usecase.UserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {

    @Bean
    public UserUseCase userUseCase(UserGateway userGateway){
        return new UserUseCase(userGateway);
    }
}
