package com.co.ias;

import com.co.ias.DBO.UserDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IUserRepository extends JpaRepository<UserDBO, Long> {
}
