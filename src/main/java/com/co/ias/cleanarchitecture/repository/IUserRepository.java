package com.co.ias.cleanarchitecture.repository;

import com.co.ias.cleanarchitecture.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
