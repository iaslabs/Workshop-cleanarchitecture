package com.co.ias.DBO;

import com.co.ias.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "users")
public class UserDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;

    public UserDBO(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public UserDBO() {
    }

    public static UserDBO fromDomain(User user) {
        return new UserDBO(user.getId(), user.getName(), user.getEmail());
    }

    public User toDomain() {
        return new User(this.id, this.name, this.email);
    }

}
