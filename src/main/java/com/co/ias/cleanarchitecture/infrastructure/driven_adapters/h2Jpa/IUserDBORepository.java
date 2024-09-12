package com.co.ias.cleanarchitecture.infrastructure.driven_adapters.h2Jpa;

import com.co.ias.cleanarchitecture.infrastructure.driven_adapters.h2Jpa.DBO.UserDBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDBORepository extends JpaRepository<UserDBO, Integer> {
}
