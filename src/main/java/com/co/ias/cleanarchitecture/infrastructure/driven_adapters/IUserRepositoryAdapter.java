package com.co.ias.cleanarchitecture.infrastructure.driven_adapters;

import com.co.ias.cleanarchitecture.infrastructure.driven_adapters.DBO.UserDBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepositoryAdapter extends JpaRepository<UserDBO, Integer> {
}
