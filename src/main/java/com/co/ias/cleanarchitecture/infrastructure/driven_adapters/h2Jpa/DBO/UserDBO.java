package com.co.ias.cleanarchitecture.infrastructure.driven_adapters.h2Jpa.DBO;

import com.co.ias.cleanarchitecture.domain.model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserDBO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

    public static UserDBO fromDomain(User user){
        return new UserDBO(user.getId(), user.getName(), user.getEmail());
    }

    public User toDomain(){
        return new User(id, name, email);
    }
}
